package at.willhaben.workshop.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;

@Controller
@RequestMapping("/")
public class CallbackController {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/callback")
    public String get() throws IOException, InterruptedException {
        return "callback-1";
    }

}
