package com.github.chanwookpark.awssandbox;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chanwook
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "Hi~";
    }
}
