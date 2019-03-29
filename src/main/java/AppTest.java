import org.springframework.context.support.ClassPathXmlApplicationContext;

import AeroportSpring.entity.Ville;
import AeroportSpring.service.VilleService;


public class AppTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		Ville v = new Ville();
		VilleService villeService = ctx.getBean(VilleService.class);
		v.setNom("Paris");
		villeService.insert(v);
		villeService.delete(v);
		
		ctx.close();
	}

}
