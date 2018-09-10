package net.netasystems.main;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.netasystem.domain.CatTipoFabrica;
import net.netasystems.dao.CatTipoFabricaDAO;

public class Main {
	
	public static void main(String []args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CatTipoFabricaDAO dao = ctx.getBean(CatTipoFabricaDAO.class);
		BigDecimal bg =new BigDecimal(10);
		BigDecimal bg1 =new BigDecimal(3);
		CatTipoFabrica cat = new CatTipoFabrica(bg,"Prueba,,,","1",null, bg1);
		System.out.println(dao.count());
		System.out.println(dao.insert(cat)); //comentado para evitar que se produzca un error en las pruebas...
		System.out.println(dao.delete(cat));
		cat.setNombre("Hola mundo1");
		System.out.println(dao.count());
		System.out.println(dao.update(cat));// comentado para evitar problemas con las pruebas siguientes
		
		for(CatTipoFabrica cat1: dao.selectAll()) {
			System.out.println(cat1.toString());
		}
	}
}
