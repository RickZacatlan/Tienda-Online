package com.DemoOnline.tiendaOnline.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class controller {

    @PostMapping (value = "controller")
    public String controller()
    {
        return "welcome form secure endpoint";
    }
}
