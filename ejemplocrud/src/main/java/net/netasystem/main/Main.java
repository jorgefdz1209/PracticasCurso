package net.netasystem.main;

import java.sql.SQLException;
import java.util.List;

import net.netasystem.service.CatTipoFabricaService;
import net.netasystem.domain.CatTipoFabrica;

public class Main {

	public static void main(String[] args) {
		System.out.println("Iniciando Programa");
		CatTipoFabrica c1;
		CatTipoFabricaService service = null;
		try {
			service = new CatTipoFabricaService();
			List<CatTipoFabrica> lista =service.getAllRecords();
			for(CatTipoFabrica c : lista) {
				System.out.println(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				service.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Inicio de la inserccion.....");
		
		try {
			service = new CatTipoFabricaService();
			c1 = new CatTipoFabrica(4,"Prueba,,,", '1',null, 3);
			service.addRecord(c1);
			List<CatTipoFabrica> lista =service.getAllRecords();
			for(CatTipoFabrica c : lista) {
				System.out.println(c);
			}
			System.out.println("-------------------------------------------------");
			c1.setNombre("hola mundo");
			c1.setIdTipoFabrica(3);
			service.updateRecord(c1);
			System.out.println("UPDATE ......");
			for(CatTipoFabrica c : lista) {
				System.out.println(c);
			}
			System.out.println("-------------------------------------------------");
			service.deleteRecord(c1);
			for(CatTipoFabrica c : lista) {
				System.out.println(c);
			}
			System.out.println("-------------------------------------------------");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				service.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
