import org.springframework.context.support.ClassPathXmlApplicationContext;

import AeroportSpring.entity.ClientEl;
import AeroportSpring.entity.ClientMoral;
import AeroportSpring.entity.ClientPhysique;
import AeroportSpring.repository.ClientRepository;
import AeroportSpring.services.ClientService;


public class AppTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		ClientService repo=ctx.getBean(ClientService.class);
		
		ClientEl nicolas= new ClientEl();
		nicolas.setPrenom("jfije");
		nicolas.setNom("jpjo");
	 	repo.insert(nicolas);
	
		ClientPhysique mahomet= new ClientPhysique();
		mahomet.setNom("halla");
		mahomet.setPrenom("wakbaao");
		mahomet.setNumeroTel(06052252);
		mahomet.setNumeroFax(065225252);
		repo.insert(mahomet);
			
			ClientMoral hola= new ClientMoral();
		hola.setNom("Gringo");
		hola.setSiret("jufhujf5ud");
		hola.setNumeroTel(06052252);
			hola.setNumeroFax(065225252);
			repo.insert(hola);
		System.out.println(repo);
		ctx.close();
	}

}
