package MVC.View;

import MVC.POJO.school;
import MVC.POJO.student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/rests")
@RestController
public class restController {
    @PostMapping
    public String restForget()
    {
        return "have a rest";
    }
    /*@RequestMapping(value = "/rests",method = RequestMethod.DELETE)
    @ResponseBody
    public String restForDelete()
    {
        return "you have deleted something";
    }*/
    @GetMapping
    public String restForDelete(@RequestBody school school)
    {
        System.out.println(school);
       return "quest received";
    }
}
