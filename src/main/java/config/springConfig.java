package config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Date;

@Configuration
@ComponentScan(value = "MVC",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class))
@PropertySource("classpath:jdbc.properties")
@Import({jdbcConfig.class,mybatisConfig.class})
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class springConfig {

}
