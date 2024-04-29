// Tyler J. Teichmann

package com.example.PersonalPortfolio.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    // Get Mapping to the /about extension
    @GetMapping("/about")
    public String about() {
        // Return about.html
        return "about";
    }

}