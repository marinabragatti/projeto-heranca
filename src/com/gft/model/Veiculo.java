package com.gft.model;

public class Veiculo {
	

	private String modelo;
	
	private double velocidade;
	
	private int passageiros;
	
	private double combustivel;
	
	public String getmodelo() {
		return modelo;
	}
	
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getvelocidade() {
		return velocidade;
	}
	
	public void setvelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public int getpassageiros() {
		return passageiros;
	}
	
	public void setpassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	
	public double getcombustivel() {
		return combustivel;
	}
	
	public void setcombustivel(double combustivel) {
		this.combustivel = combustivel;
	}
	
	//Métodos
	
	public void pegarModelo(String modelo) {
		this.modelo = modelo;
	}
	

}
