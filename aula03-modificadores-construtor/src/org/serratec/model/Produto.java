package org.serratec.model;

public class Produto {
    private int codigo;
    private String descricao;
    private double valor;
    
    public Produto(int codigo , String descricao, double valor) {
    	this.codigo = codigo; 
    	this.descricao = descricao;
    	this.valor = valor;
    	System.out.println("Contrutor cheio.");
    }
    
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getDescreicao() {
		return descricao;
	}
	
	public void setDescreicao(String descreicao) {
		this.descricao = descreicao;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
    
    
   
}
