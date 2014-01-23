package springDB;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springDB.domain.BiasingAudit;

public class TestDB {

	public  static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		BiasingAudit biasingAudit = (BiasingAudit) context.getBean("BiasingAudit");
		biasingAudit.print();
	}
}
