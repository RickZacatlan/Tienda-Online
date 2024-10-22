package com.DemoOnline.tiendaOnline.Authentication;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class Authenticationcontrol {

    @PostMapping (value = "login")
    public String login()
    {
        return "login from public endpoint";
    }
}
