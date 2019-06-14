package com.br.zup.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.br.zup.modelo.Vaga;

public class EstacionamentoDigital {public static void main(String[] args) throws InterruptedException {

	List<Vaga> listaVagas = new ArrayList<Vaga>();

	Scanner scan = entrada();

	Vaga vagas = new Vaga();
	int controle = 1;

	System.out.println("Digite a quantidade de vagas para carros do seu estacionamento :");
	int vagasCarros = scan.nextInt();

	System.out.println("Digite a quantidade de vagas para motos do seu estacionamento :");
	int vagasMotos = scan.nextInt();

	int vagasIdoso = vagas.quantidadeVagaIdoso(vagasCarros);
	int vagasDeficiente = vagas.quantidadeVagaDeficiente(vagasCarros);
	int vagasComum = vagasCarros - (vagasIdoso + vagasDeficiente);

	listaVagas = vagas.nomearVagas(listaVagas, vagasIdoso, vagasDeficiente, vagasComum, vagasMotos);

	while (controle == 1) {
		Scanner scanIf = entrada();

		System.out.println("Digite 1 para visualizar nossas vagas\n" + "Digite 2 para estacionar um veiculo\n"
				+ "Digite 3 retirar um veiculo\n" + "digite 4 para sair do sistema");
		int opcao = scanIf.nextInt();

		if (opcao == 1) {
			vagas.exibirVagas(listaVagas);

		} else if (opcao == 2) {
			vagas.entradaVeiculos(listaVagas);

		} else if (opcao == 3) {
			vagas.retiraVeiculo(listaVagas);

		} else if (opcao == 4) {
			controle = 0;
		}

	}

}

	public static Scanner entrada() {
		Scanner scan = new Scanner(System.in);

		return scan;
}
}
