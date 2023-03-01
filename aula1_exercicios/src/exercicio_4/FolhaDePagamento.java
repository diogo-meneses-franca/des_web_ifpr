package exercicio_4;

public class FolhaDePagamento {
    private Funcionario funcionario;
    private double salarioBruto;
    private double impostoDeRenda;
    private double fgts;
    private double taxaSindical;

    private double aliquotaIR;
    private double inss;
    private double salarioLiquido;

    FolhaDePagamento(Funcionario funcionario){
        this.funcionario = funcionario;
    }
    private void calculaSalarioBruto(){
        this.salarioBruto = this.funcionario.getHorasTrabalhadas() * this.funcionario.getValorPorHoraTrabalhada();
    }

    private void calculaImpostoDeRenda(){
        if (this.salarioBruto >= 900.0){
            this.aliquotaIR = 0;
            this.impostoDeRenda = 0;
        } else if (this.salarioBruto > 900 && this.salarioBruto <= 1500) {
            this.aliquotaIR = 0.05;
            this.impostoDeRenda = this.salarioBruto * aliquotaIR;
            
        } else if (this.salarioBruto > 1500 && this.salarioBruto <= 2500) {
            this.aliquotaIR = 0.1;
            this.impostoDeRenda = this.salarioBruto * aliquotaIR;
            
        }else{
            this.aliquotaIR = 0.2;
            this.impostoDeRenda = this.salarioBruto * aliquotaIR;
        }

    }

    private void calculaFgts(){
        this.fgts = this.salarioBruto * 0.11;
    }

    private void calculaTaxaSindical(){
        this.taxaSindical = this.salarioBruto * 0.03;
    }

    private void calculaInss(){
        this.inss = this.salarioBruto * 0.10;
    }

    private void calculaSalarioLiquido(){
        this.salarioLiquido = this.salarioBruto - (this.impostoDeRenda + this.inss + this.taxaSindical);
    }

    public void getFolhaDePagamento(){
        calculaSalarioBruto();
        calculaImpostoDeRenda();
        calculaInss();
        calculaFgts();
        calculaTaxaSindical();
        calculaSalarioLiquido();
        System.out.printf(" Salário Bruto: (%.0f * %d) : R$ %.2f%n",  this.funcionario.getValorPorHoraTrabalhada(), this.funcionario.getHorasTrabalhadas(), this.salarioBruto);
        System.out.printf(" (-) IR ( %.0f )             : R$ %.2f%n", (aliquotaIR * 100), this.impostoDeRenda);
        System.out.printf(" (-) INSS (10%%)           : R$ %.2f%n", this.inss);
        System.out.printf(" FGTS (11%%)               : R$ %.2f%n", this.fgts);
        System.out.printf(" Total de Descontos       : R$ %.2f%n", (this.impostoDeRenda + this.inss + this.taxaSindical));
        System.out.printf(" Salário Líquido          : R$ %.2f%n", this.salarioLiquido);
    }
}
