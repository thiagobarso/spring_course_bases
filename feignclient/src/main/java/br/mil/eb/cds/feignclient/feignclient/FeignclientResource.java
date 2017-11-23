package br.mil.eb.cds.feignclient.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignclientResource {

    @Autowired
    private DiscoveryFeignClient client;

    @GetMapping("/chamadaFeign")
    public String chamadaFeign(){
        return client.getClients();
    }
}
