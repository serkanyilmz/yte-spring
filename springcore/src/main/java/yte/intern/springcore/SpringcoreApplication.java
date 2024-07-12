package yte.intern.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringcoreApplication.class, args);
		//TestBean bean = context.getBean(TestBean.class);
		//bean.print();

		//DependencyInjectionTest bean1 = context.getBean(DependencyInjectionTest.class);
		//bean1.print();

		Semiramis bean2 = context.getBean(Semiramis.class);
		bean2.print();


	}

}
