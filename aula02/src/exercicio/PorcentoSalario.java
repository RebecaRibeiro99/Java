package exercicio;

import javax.swing.JOptionPane;

public class PorcentoSalario {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String telefone = JOptionPane.showInputDialog("Digite seu telefone: ");
        String email = JOptionPane.showInputDialog("Digite seu email: ");
        String salario = JOptionPane.showInputDialog("Digite seu sal�rio ");

        Double salario_nome =  Double.parseDouble(salario);

        double salarioPorCento = salario_nome*0.10;
        double resultado = salario_nome+salarioPorCento;

        JOptionPane.showInternalMessageDialog(null, (nome));
        JOptionPane.showInternalMessageDialog(null, (telefone));
        JOptionPane.showInternalMessageDialog(null, (salario));
        JOptionPane.showInternalMessageDialog(null, (resultado));
    }
}