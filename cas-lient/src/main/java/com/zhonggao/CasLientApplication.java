package com.zhonggao;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCasClient
@SpringBootApplication
public class CasLientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasLientApplication.class, args);
	}

}
