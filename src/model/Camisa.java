package model;

public abstract class Camisa {

	private static int idContar = 1;
	private int id;
	String time;
	String modelo;
	String tamanho;

	public Camisa(String time, String modelo, String tamanho) {
		this.id = idContar++;
		this.time = time;
		this.modelo = modelo;
		this.tamanho = tamanho;
	}

	public String getTime() {
		return time;
	}

	public int getId() {
		return id;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public void visualizar() {
		String modeloDescricao = this.modelo.equals("Antigo") ? "Modelo Antigo" : "Modelo Novo";
		System.out.println("ID do produto: " + this.id); 
		System.out.println("Time: " + this.time);
		System.out.println("Modelo da Camisa: " + modeloDescricao);
		System.out.println("Tamanho da Camisa: " + this.tamanho);
		System.out.println("=====================================");

	}

}
