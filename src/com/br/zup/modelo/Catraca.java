package com.br.zup.modelo;

import java.util.Scanner;

public class Catraca {
	
	private double horaEntrada = 0;
	private double horaSaida = 0;
	private double precoPeriodo = 10;
	private double precoAdicional = 5;

	public Catraca(double horaEntrada, double horaSaida, double precoPeriodo, double precoAdicional) {
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
		this.precoPeriodo = precoPeriodo;
		this.precoAdicional = precoAdicional;
	}

	public Catraca() {

	}

	public double getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(double horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public double getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(double horaSaida) {
		this.horaSaida = horaSaida;
	}

	public double getPrecoPeriodo() {
		return precoPeriodo;
	}

	public void setPrecoPeríodo(double precoPeriodo) {
		this.precoPeriodo = precoPeriodo;
	}

	public double getPrecoAdicional() {
		return precoAdicional;
	}

	public void setPrecoAdicional(double precoAdicional) {
		this.precoAdicional = precoAdicional;
	}

	public String toString() {
		String modelo = "";

		modelo += "Hora de entrada : " + this.getHoraEntrada()+ "\n";
		modelo += "Hora de saida : " + this.getHoraSaida()+ "\n";

		return modelo;
	}

	public Catraca inserirHoraEntrada() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Catraca novaEntrada = new Catraca();

		System.out.println("Digite a hora da entrada :");
		double hora = scan.nextDouble();
		novaEntrada.setHoraEntrada(hora);

		return novaEntrada;

	}

	public void caculaValor(Catraca catraca1) {
		Scanner scan = entrada();
		Catraca catraca = catraca1;
		double valor = 0;

		System.out.println(catraca);

		System.out.println("\nDigite a hora da saida :\n");
		double saida = scan.nextDouble();
		catraca.setHoraSaida(saida);

		System.out.println(catraca);

		double estadia = (catraca.getHoraSaida() - catraca.getHoraEntrada());

		if (estadia <= 0.15) {
			valor = 0;
		} else if (estadia > 0.15 && estadia <= 1) {
			valor = catraca.getPrecoPeriodo();
		} else if (estadia > 1) {

			double hora = Math.ceil(estadia - 1);
			int horaAdicional = (int) hora;

			valor = catraca.getPrecoPeriodo() + (horaAdicional * catraca.getPrecoAdicional());

		}

		System.out.println("Total de estadia :\n" + estadia);

		System.out.println("\nTotal a pagar :\n" + valor);

	}

	public Scanner entrada() {
		Scanner scan = new Scanner(System.in);
		return scan;
}

}