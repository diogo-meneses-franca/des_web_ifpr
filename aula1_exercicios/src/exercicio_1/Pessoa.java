package exercicio_1;

public class Pessoa {
    private Integer idade;

    public Integer getIdade() {
        return this.idade;
    }
    public void setIdade(Integer idade){
        this.idade = idade;

    }

    public String verificarFaixaEtaria() {
        if (this.idade < 10) {
            return "criança";
        } else if (this.idade >= 12 && this.idade < 18) {
            return "adolescente";
        } else if (this.idade >= 18 && this.idade < 60) {
            return "Adulto";
        } else {
            return "Idoso";
        }

    }
}
