package com.netasystem.granja;

public class Cochinito implements Runnable{
	//sin funcionamiento
	public Cochinito() {
		super();
	}

	public void comsumeMaiz() {
		Maiz maizParaComsumir = Parsela.getMaiz();
		if(maizParaComsumir == null) {
			System.out.println("no hay maiz");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Estoy consumiendo el maiz "+ maizParaComsumir.toString());
	}

	@Override
	public void run() {
		while (true) {
		comsumeMaiz();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Excetion por interrupcion");
		}
		}
	}
	
}
