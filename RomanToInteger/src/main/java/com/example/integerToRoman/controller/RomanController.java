package com.example.integerToRoman.controller;

import com.example.integerToRoman.Service.IntegerToRomanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/roman/")
@CrossOrigin
public class RomanController {
    @Autowired
    private IntegerToRomanService romanService;

    @GetMapping("/conversion/{integer}")
    public String convert(@PathVariable int integer){
       String roman = romanService.convertToRoman(integer);
       return roman;
    }
}
