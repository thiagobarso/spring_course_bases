package br.mil.eb.cds.springcloudeurekaweb.springcloudeurekaweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryClientResource {

    @Autowired
    DiscoveryClient client;

    @GetMapping("/clients")
    public String client(){
        StringBuilder sb = new StringBuilder();
        client.getServices().forEach(service ->
                client.getInstances(service).forEach(
                    instance ->
                            sb.append(String.format(
                            "Instancia - Host: %s - port: %d %n",
                                    instance.getHost(), instance.getPort()))
        ));
        return sb.toString();
    }
}
