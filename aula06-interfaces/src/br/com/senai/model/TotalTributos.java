package br.com.senai.model;

public class TotalTributos {
    private double total;
    
    public void totalizarTributos(Tributos tributos) {
    	total += tributos.calcularICMS();
    	total+= tributos.calcularImpostoDeRenda();
    	
    	//*System.out.println(tributos.toString() = "\n"+ " ICMS"+ tributos.calcularICMS();
    	//*System.out.println(tributos.toString() = "\n"+ " ICMS"+ tributos.calculatImposto();
    }

	public double getTotal() {
		return total;
	}
}