package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice{

	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("예회가 발생하였습니다."+e.getMessage());
	}
}
