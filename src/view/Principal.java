package view;

import java.util.Scanner;
import javax.swing.JOptionPane;
import controller.Metodos;

public class Principal {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		
		Metodos metodos = new Metodos();

		int opc = 0;
		String sO;

		// In�cio de la�o de repeti��o com switch case, alternativas para o usu�rio.
		while (opc != 9) {

			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha a op��o desejada: \n\n 1 - Lista de Processos: \n 2 - Eliminar processo pelo PID: " + "\n 3 - Eliminar processo pelo Nome: \n"
							+ " 9 - Finalizar Programa. \n\n"));
			
			switch (opc) {

			case 1:
				metodos.listaProcessos();
			break;

			case 2:
				int pid = Integer.parseInt(JOptionPane.showInputDialog("Insira o n�mero do PID para elimina��o: "));
				metodos.KillProcessPorPid(pid);
			break;
			
			case 3:
				String processo = (JOptionPane.showInputDialog("Insira o nome do processo para elimina��o: "));
				metodos.KillProcessPorNome(processo);
			break;

			case 9:
				System.out.println("\nProcesso Finalizado!");
				break;
				

			default:
				System.out.println("Op��o Inv�lida!");
				break;

			}
		}
		sc.close();
	}
}

	
