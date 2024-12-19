package menu;

import java.util.Scanner;

import controller.CamisaController;
import model.ModeloAntigo;
import model.ModeloNovo;
import model.Camisa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu {

	public static void main(String[] args) {
		int opcao;
		String time;
		Scanner leia = new Scanner(System.in);

//		Camisa modeloNovo = new ModeloNovo("Corinthians", "Novo", "G");
//		Camisa modeloAntigo = new ModeloAntigo("Flamengo", "Antigo", "M");
//
//		System.out.println(modeloNovo.getTime());
//		System.out.println(modeloAntigo.getTime());

		CamisaController camisaController = new CamisaController();

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                CAMISA DE TIME                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Fazer o Pedido da Camisa             ");
			System.out.println("            2 - Listar Camisas Selecionadas          ");
			System.out.println("            3 - Deletar um Produto                   ");
			System.out.println("            4- Sair do Programa                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite o Tipo da Camisa (1- Modelo Novo, 2- Modelo Antigo): ");
				int tipo = leia.nextInt();
				System.out.println("Digite o time: ");
				time = leia.next();
				System.out.println("Digite o tamanho da camisa (G, GG ou M): ");
				String tamanho = leia.next();

				Camisa novaCamisa = null;

				if (tipo == 1) {
					novaCamisa = new ModeloNovo(time, "novo", tamanho);
				} else if (tipo == 2) {
					novaCamisa = new ModeloAntigo(time, "Antigo", tamanho);
				}

				if (novaCamisa != null) {
					camisaController.cadastrar(novaCamisa);
					System.out.println("Camisa cadastrada! ");
				}
				keyPress();
				break;

			case 2:
				System.out.println("Listar camisas Disponiveis");
				camisaController.listarTodas();
				keyPress();
				break;

			case 3:
				System.out.println("Digite o numero da camisa a ser removido: ");
				int numero = leia.nextInt();
				camisaController.deletar(numero);
				keyPress();
				break;

			case 4:
				System.out.println("Saindo do programa. Até logo!");
				leia.close();
				System.exit(0);
				keyPress();
				break;

			default:
				System.out.println("Opção Invalida, digite outro número");
				keyPress();
				break;
			}

		}
	}

	public static void keyPress() {
		try {
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
