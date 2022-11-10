package MVC.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* MVC.service.*Service.select(..))")
    private void pointCut(){}

    @Around("pointCut()")
    public Object method(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("在运行了");
        Object[] objects= pjp.getArgs();
        for (int i=0;i<objects.length;i++)
        {
            if (objects[i].getClass().equals(String.class))
            objects[i]=objects[i].toString().trim();
        }
         Object ret =pjp.proceed(objects);
         return ret;
    }
}
