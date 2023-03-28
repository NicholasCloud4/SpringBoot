package com.ltp.workbook21;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowsController {
    @GetMapping("/")
    public String getShows(){
        return "shows";
    }
}
