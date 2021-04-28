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
	
	/*	���������� �����ϴ� ������� �ڵ带 ����
		Exam exam = new NewlecExam();
		//Exam exam = new NewlecExam(10,10,10,10);
		
		//ExamConsole console = new InlineExamClonsole(exam); // ���ٿ� ��� // DI
		ExamConsole console = new GridExamClonsole();// �׸��� �������� ��� // DI
		console.setExam(exam);
	*/
	/* 
	 	xml �� ������ �ϴ°�	
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
	*/			
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(NewlecDiConfig.class);
		
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
		// �̸����� ã�°�
		ExamConsole console = (ExamConsole) context.getBean("console");
		
		// �������� ã�°�
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
