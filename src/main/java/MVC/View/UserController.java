package MVC.View;

import MVC.POJO.school;
import MVC.POJO.student;
import com.google.gson.Gson;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/page")
    public String jumpToPage()
    {
        return "page.jsp";
    }
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody List<String> likes){
        System.out.println(likes);
           return "quest received";
       }
    @RequestMapping("/locate")
    @ResponseBody
    public String locate(@RequestBody school school){
        System.out.println(school);
        return "quest received";
    }
    @RequestMapping("/live")
    @ResponseBody
    public String live(@RequestBody List<school> school){
        System.out.println(school);
        return "quest received";
    }
    @RequestMapping("/date")
    @ResponseBody
    public String date(Date date,@DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")Date date3){

        System.out.println(date);
        System.out.println(date1);
        System.out.println(date3);
        return "quest received";
    }
}
