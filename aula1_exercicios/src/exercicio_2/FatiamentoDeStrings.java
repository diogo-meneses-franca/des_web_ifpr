package ex_2;

import javax.swing.JOptionPane;

public class FatiamentoDeStrings {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite os valores separados por vírgula: ");
        FatiamentoDeStrings fatiamentoDeStrings = new FatiamentoDeStrings();
        fatiamentoDeStrings.fatiamento(palavra);

    }
    public void fatiamento(String palavra){
        String[] valoresSeparados = palavra.split(",");
        for (int i = valoresSeparados.length -1; i >= 0; i--){
            System.out.println(valoresSeparados[i]);
        }
    }
}
