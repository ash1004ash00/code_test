package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

@ComponentScan("spring.di.ui")
@Configuration
public class NewlecDiConfig {
	// 이름을 id 라고 생각하고 exam
	@Bean
	public Exam exam() {
		return new NewlecExam();
	}
}
