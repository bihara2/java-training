package com.bihara.config.consumer.configconsumer;

import com.bihara.config.consumer.configconsumer.model.MembershipProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller   //@RestController to receive it via postman // @Controller to serve data to the html page
public class ProfileController {

    @Autowired
    MembershipProfileConfiguration membershipProfileConfiguration;

    /*@RequestMapping("/profile") // for get data using post man
    public MembershipProfileConfiguration getConfig(){
        return membershipProfileConfiguration;
    }*/

    @RequestMapping("/profile")
    public String getConfig(Model model){
        model.addAttribute("model",membershipProfileConfiguration.getDefaultModel());
        model.addAttribute("min",membershipProfileConfiguration.getRentPeriod());
        return "mprofile";
    }
}
