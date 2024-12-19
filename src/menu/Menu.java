package menu;

import java.util.Scanner;

//import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		int opcao;

		Scanner leia = new Scanner(System.in);

		// System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                CAMISA DE TIME                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Fazer Cadastrar                      ");
			System.out.println("            2 - Listar Camisas Disponiveis           ");
			System.out.println("            3 - Atualizar                            ");
			System.out.println("            4 - Deletar um produto                   ");
			System.out.println("            5- Sair do programa                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();
			
			
			switch(opcao) {
			
			case 1:
				System.out.println("Fazer cadastro ");
				break;
				
			case 2: 
				System.out.println("Listar camisas Disponiveis");
				break;
				
			case 3:
				System.out.println("Atualizar");
				break;
				
			case 4: 
				System.out.println("Atualizar um produto");
				break;
				
			case 5:
                System.out.println("Saindo do programa. Até logo!");
                leia.close();
                System.exit(0);
				
			default:
				System.out.println("Opção Invalida, digite outro número");
				break;
			}

		}

	}

}
