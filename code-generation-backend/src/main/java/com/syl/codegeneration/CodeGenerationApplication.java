package com.syl.codegeneration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
public class CodeGenerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeGenerationApplication.class, args);
	}

}
