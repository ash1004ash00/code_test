package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamClonsole;
import spring.di.ui.InlineExamClonsole;

public class Program {

	public static void main(String[] args) {
	
	/*	스프링에게 지시하는 방법으로 코드를 변경
		Exam exam = new NewlecExam();
		//Exam exam = new NewlecExam(10,10,10,10);
		
		//ExamConsole console = new InlineExamClonsole(exam); // 한줄에 출력 // DI
		ExamConsole console = new GridExamClonsole();// 그리드 형식으로 출력 // DI
		console.setExam(exam);
	*/
	/* 
	 	xml 을 가지고 하는것	
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
	*/			
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(NewlecDiConfig.class);
		
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
		// 이름으로 찾는거
		ExamConsole console = (ExamConsole) context.getBean("console");
		
		// 형식으로 찾는거
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		//List<Exam> exams = new ArrayList<>();
		//List<Exam> exams = (List<Exam>) context.getBean("exams");
		//exams.add(new NewlecExam(1,1,1,1));
	/*
		for(Exam e : exams) {
			System.out.println(e);
		}
	*/
	}

}
