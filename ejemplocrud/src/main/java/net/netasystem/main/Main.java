package net.netasystem.main;

import java.sql.SQLException;
import java.util.List;

import net.netasystem.service.CatTipoFabricaService;
import net.netasystem.domain.CatTipoFabrica;

public class Main {

	public static void main(String[] args) {
		System.out.println("Iniciando Programa");
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
				service.cierra();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
