package ie.atu.week3lab1;

import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/person")
public class Week3 {
    @GetMapping("/message")
    public String getMessage(){
        return "Some message";
    }

    @GetMapping("/details")
    public String getDetails(){
        return "Some other message";
    }

    @GetMapping("/hello")
    public String getHello(){
        return ("HELLO");
    }
    @GetMapping("/greet/{name}")
    public String getGreetByName(@PathVariable String name){
        return "hello, " + name;
    }


}

