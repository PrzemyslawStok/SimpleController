package com.example.SimpleControllerKotlin

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {
    @RequestMapping("")
    fun info():String{
        return "info 12345"
    }
}
