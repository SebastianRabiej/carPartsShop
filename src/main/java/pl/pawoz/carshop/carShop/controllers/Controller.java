package pl.pawoz.carshop.carShop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {

    @GetMapping("/")
    public String x(){
        return "test";
    }
}
