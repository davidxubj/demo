package cn.javastack.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//public class DemoApplication {
public class DemoApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// 继承SpringBootServletInitializer 实现configure 方便打war 外部服务器部署。
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(DemoApplication.class);
	}


	/*
	@GetMapping("/hello")
	public String hello()
	{
		return "hello, my name is david";
	}
*/
}

// Users/xuhongzhou/Desktop/workspace/demo/target
// target xuhongzhou$ nohup java -jar demo-0.0.1-SNAPSHOT.jar >temp.txt &
