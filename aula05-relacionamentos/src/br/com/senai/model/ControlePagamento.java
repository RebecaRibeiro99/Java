package br.com.senai.model;

public class ControlePagamento {
    private double totalPago;

	public double getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(double totalPago) {
		this.totalPago = totalPago;
	}
    
    public void calcularTotalPagp(Plano plano) {
    	totalPago += plano.getValorPago();
    }
    
    
}
