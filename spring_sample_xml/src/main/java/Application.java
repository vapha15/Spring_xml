import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.ICustomerService;

public class Application {

	private static ApplicationContext appContext;

	public static void main(String[] args) {

		// ICustomerService service = new CustomerServiceImpl();

		appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		ICustomerService service = appContext.getBean("customerService", ICustomerService.class);

		System.out.println(service.findAll().get(0).getFirstName());
	}

}
