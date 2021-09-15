package cn.medemede.cdpserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xcp
 */
@RestController
public class LoginController {

    @GetMapping("/main")
    public String login() {
        return "XCP, CDP";
    }
}
