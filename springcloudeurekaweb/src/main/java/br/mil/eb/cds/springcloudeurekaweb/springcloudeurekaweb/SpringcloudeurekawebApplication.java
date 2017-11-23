package br.mil.eb.cds.springcloudeurekaweb.springcloudeurekaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudeurekawebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudeurekawebApplication.class, args);
	}
}
