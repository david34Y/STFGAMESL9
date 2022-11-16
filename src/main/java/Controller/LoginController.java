package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {



    @GetMapping(value = "/login")
    public String login(HttpSession session){
        return "login";
    }
}
