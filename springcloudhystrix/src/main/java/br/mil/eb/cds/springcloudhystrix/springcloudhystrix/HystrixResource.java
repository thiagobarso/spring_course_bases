package br.mil.eb.cds.springcloudhystrix.springcloudhystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixResource {

    @Autowired
    private HystrixService service;

    @GetMapping("/mensagem")
    private String getMensagem(){
        return service.getMensagem();
    }

}
