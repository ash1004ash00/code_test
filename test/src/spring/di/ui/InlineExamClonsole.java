package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class InlineExamClonsole implements ExamConsole {
	
	@Autowired
	//@Autowired(required=false) //자동으로 객체를 연동해주세요 -> 자료형식을 기본으로 찾아준다 : 여기서는 Exam
	//		  -> 식별이 에매할 떄는 변수명으로도 찾아준다.
	//@Qualifier("exam1") // id 값을 exam1 으로 해주세요
	private Exam exam;
	
	public InlineExamClonsole() {
		System.out.println("constrictor");
	}
	
	public InlineExamClonsole(Exam exam) {
		System.out.println("overloaded constrictor");
		this.exam = exam;
	}
/*	
	// 파라미터를 달고있는 생성자는 Qualifier를 변수안에 집어넣어야한다.
	@Autowired
  	public InlineExamClonsole(@Qualifier("exam1")Exam exam) {
		System.out.println("overloaded constrictor");
		this.exam = exam;
	}
*/

	@Override
	public void print() {
		if(exam == null) {
			System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		}else {
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
		}
	}
	
	//@Autowired //자동으로 객체를 연동해주세요 -> 자료형식을 기본으로 찾아준다 : 여기서는 Exam
							//		  -> 식별이 에매할 떄는 변수명으로도 찾아준다.
	//@Qualifier("exam1") // id 값을 exam1 으로 해주세요
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;
	}

}
