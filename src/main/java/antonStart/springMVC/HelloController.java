package antonStart.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
    //эта аннотация говорит нам, что мы хотим обработать GET запрос от пользователя
    @GetMapping("/h")
    //@RequestMapping(value = "/h", method = RequestMethod.GET) - старый аналогичный вариант
    public String sayHello(){
        return "my_Hello";
    }
}
