package MVC.View;

import MVC.POJO.student;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @RequestMapping("/page")
    public String jumpToPage()
    {
        return "page.jsp";
    }
    @RequestMapping("/save")
    @ResponseBody
    public student save()
    {
        student student=new student(1,"3","3",5);
        System.out.println(student);
        return student;
    }
    @RequestMapping("/read")
    @ResponseBody
    public String read(String [] books)
    {
        System.out.println(Arrays.toString(books));
        return Arrays.toString(books);
    }
    @RequestMapping("/write")
    @ResponseBody
    public String write(@RequestParam("papers") List<String> papers)
    {
        System.out.println(papers);
        return "集合";
    }

}
