package view;

import java.util.Scanner;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		RedesController rc = new RedesController();
		String os = rc.os();
		System.out.println(os);
		
		int opc = 10;
		do {
			System.out.println("Insira o processo que você deseja chamar: \n"
					+ "1 - mostrar ip \n"
					+ "2 - mostrar ping \n"
					+ "0 - sair");
				opc = Integer.parseInt(ler.nextLine());
			
			if (opc == 1) {
				System.out.println(rc.ip(os));
			}else if(opc == 2) {
				System.out.println(rc.ping(os));
			}
			
		}while(opc != 0);
		ler.close();
		
	}

}
