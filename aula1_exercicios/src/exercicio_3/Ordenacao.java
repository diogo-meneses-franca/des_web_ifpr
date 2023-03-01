package ex_3;

import javax.swing.JOptionPane;
public class Ordenacao {
    public static void main(String[] args) {
        String valores = JOptionPane.showInputDialog("Digite três valores separados por vírgula: ");
        Ordenacao ordenacao = new Ordenacao();
        ordenacao.ordenaValores(valores);


    }
    public void ordenaValores(String valores){
        String[] valoresSeparados = valores.split(",");
        Integer[] valoresInteirosSeparados = new Integer[3];
        System.out.println(valoresInteirosSeparados.length);
        for(int i = 0; i < valoresSeparados.length; i++){
            Integer valorInteiro = Integer.parseInt(valoresSeparados[i]);
            valoresInteirosSeparados[i] = valorInteiro;
        }
        for(int i = 0; i < valoresInteirosSeparados.length; i++){
            int temp;
            for(int j = 0; j < valoresInteirosSeparados.length; j++){
                if(valoresInteirosSeparados[j] > valoresInteirosSeparados[i]){
                    temp = valoresInteirosSeparados [i];
                    valoresInteirosSeparados[i] = valoresInteirosSeparados[j];
                    valoresInteirosSeparados[j] = temp;
                }
            }
        }
        for(int k = 0; k < valoresInteirosSeparados.length; k++){
            System.out.println(valoresInteirosSeparados[k]);
        }
    }
}
