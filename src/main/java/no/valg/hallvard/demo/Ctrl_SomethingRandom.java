package no.valg.hallvard.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ctrl_SomethingRandom {

    @GetMapping(value="/")
    //@RequestMapping(value="/",method=RequestMethod.GET)
    public String hello(){
        return "Hello World!!";
    }
}
