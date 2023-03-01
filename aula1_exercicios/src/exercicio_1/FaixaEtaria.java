package exercicio_1;

import javax.swing.JOptionPane;

public class FaixaEtaria {
    public static void main(String args[]){
        String idade = JOptionPane.showInputDialog("Digite a sua idade: ");
        Integer idadeInt = Integer.parseInt(idade);
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(idadeInt);
        System.out.println(pessoa.verificarFaixaEtaria());





    }

    }
