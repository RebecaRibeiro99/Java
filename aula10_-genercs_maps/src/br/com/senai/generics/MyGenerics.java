package br.com.senai.generics;

public class MyGenerics<T> {
	private T valor;

	public MyGenerics(T valor) {
		this.valor = valor;
	}
	

	public void setValor(T valor) {
		this.valor = valor;
	}


	public T getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "MyGenerics valor=" + valor + "]";
	}
	
	
}
