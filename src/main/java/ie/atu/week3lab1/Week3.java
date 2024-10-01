package ie.atu.week3lab1;

import org.springframework.web.bind.annotation.GetMapping;
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
}
