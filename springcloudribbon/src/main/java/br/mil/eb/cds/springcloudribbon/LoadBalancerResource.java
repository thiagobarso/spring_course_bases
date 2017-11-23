package br.mil.eb.cds.springcloudribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadBalancerResource {

    @Autowired
    LoadBalancerClient client;

    @GetMapping("/proximaInstancia")
    public String proximaInstancia(){
        ServiceInstance instance = client.choose("discoveryclient");
        return String.format("Proxima instancia: %s:%d", instance.getHost(), instance.getPort());
    }

}
