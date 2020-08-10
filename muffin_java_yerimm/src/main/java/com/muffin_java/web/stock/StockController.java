package com.muffin_java.web.stock;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/stocks")
public class StockController {

    @GetMapping("/")
    public String test(){
        return "hi, i'm muffin";
    }
}
