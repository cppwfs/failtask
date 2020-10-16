package io.spring.failtask;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class FailtaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(FailtaskApplication.class, args);
	}


	@Bean
	public ApplicationRunner applicationRunner() {
		return new ApplicationRunner() {
			@Override
			public void run(ApplicationArguments args) throws Exception {
				System.out.println("Failing app should fail now but we decided against it :-D");
//				throw new IllegalArgumentException("No Task For You");
			}
		};
	}
}
