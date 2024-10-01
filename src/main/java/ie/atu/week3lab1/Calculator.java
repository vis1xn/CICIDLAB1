package ie.atu.week3lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    @GetMapping("/test")
    public String getTest(){
        return ("test complete");
    }

    @GetMapping("/calculate")
    public String getCalculator(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){
        switch (operation){
            case "add":
                int answer = num1 + num2;
                return "{\"operation\": \"" + operation + "\"total\": " + answer +"}";

            case "subtract":
                answer = num1 - num2;
                return "{\"operation\": \"" + operation + "\"total\": " + answer +"}";

            case "multiply":
                answer = num1 * num2;
                return "{\"operation\": \"" + operation + "\"total\": " + answer +"}";

            case "divide":
                answer = num1 / num2;
                return "{\"operation\": \"" + operation + "\"total\": " + answer +"}";
        }
        return operation;
    }

}
