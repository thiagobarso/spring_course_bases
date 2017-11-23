package br.mil.eb.cds.feignclient.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("discoveryclient")
public interface DiscoveryFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/clients")
    String getClients();
}
