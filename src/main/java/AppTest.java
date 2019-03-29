import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		
		
		ctx.close();
	}

}
