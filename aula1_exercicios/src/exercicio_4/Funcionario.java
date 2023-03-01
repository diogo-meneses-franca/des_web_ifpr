package exercicio_4;

public class Funcionario {

    private String nome;
    private Integer horasTrabalhadas;
    private double valorPorHoraTrabalhada;

    Funcionario(String nome, Integer horasTrabalhadas, double valorPorHoraTrabalhada){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHoraTrabalhada = valorPorHoraTrabalhada;

    }


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getHorasTrabalhadas(){
        return this.horasTrabalhadas;
    }
    public void setHorasTrabalhadas(Integer horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHoraTrabalhada(){
        return this.valorPorHoraTrabalhada;
    }

    public void setValorPorHoraTrabalhada(double valorPorHoraTrabalhada) {
        this.valorPorHoraTrabalhada = valorPorHoraTrabalhada;
    }
}
