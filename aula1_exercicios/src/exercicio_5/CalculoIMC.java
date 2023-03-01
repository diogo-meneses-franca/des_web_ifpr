package exercicio_5;
import javax.swing.JOptionPane;
import java.util.Locale;

public class CalculoIMC {
    public static void main(String[] args) {
        String sexo = JOptionPane.showInputDialog("Digite M para masculino ou F para feminino: ").toUpperCase(Locale.ROOT);
        String altura = JOptionPane.showInputDialog("Digite a sua altura em metros: ");
        Double alturaEmNumeros = Double.parseDouble(altura);
        String peso = JOptionPane.showInputDialog("Digite seu peso em kg: ");
        Integer pesoInteiro = Integer.parseInt(peso);
        CalculoIMC calculoIMC = new CalculoIMC();
        Double imc = calculoIMC.calculaIMC(alturaEmNumeros, pesoInteiro);
        String resultado = calculoIMC.getCategoria(sexo, imc);
        System.out.println(resultado);
    }

    public Double calculaIMC(Double altura, Integer peso){
        Double imc = peso / (altura * altura);
        return imc;
    }

    public String getCategoria(String sexo, Double imc){
        String categoria = null;
        switch (sexo) {
            case  "F":
                if(imc < 19.1){
                    categoria =  "Abaixo do peso.";
                } else if (imc >= 19.1 && imc < 25.8) {
                    categoria =  "Peso normal";
                } else if (imc >= 25.8 && imc < 27.3) {
                    categoria =  "Marginalmente acima do peso.";

                } else if (imc >= 27.3 && imc < 32.3) {
                    categoria =  "Acima do peso ideal.";
                }else{
                    categoria =  "Obeso!";
                }

            case "M":
                if(imc < 20.7){
                    categoria = "Abaixo do peso.";
                } else if (imc >= 20.7 && imc < 26.4) {
                    categoria = "Peso normal";
                } else if (imc >= 26.4 && imc < 27.8) {
                    categoria = "Marginalmente acima do peso.";

                } else if (imc >= 27.8 && imc < 31.1) {
                    categoria = "Acima do peso ideal.";
                }else{
                    categoria = "Obeso!";
                }
            }
        return categoria;
    }


}
