package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamClonsole implements ExamConsole {

	private Exam exam;
	
	public GridExamClonsole() {
		// TODO Auto-generated constructor stub
	}
	
	public GridExamClonsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("격자형식임 : total is %3d, avg is %3.2f\n", exam.total(), exam.avg());
	}

	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam = exam;
	}

}
