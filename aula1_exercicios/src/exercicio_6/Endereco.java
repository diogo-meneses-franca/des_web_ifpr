package exercicio_6;

public class Endereco {
    private static Integer id = 0;

    private Integer idEndereco;
    public String status = "A";
    public String nome;
    public Integer numero;

    Endereco(String nome, Integer numero){
        this.nome = nome;
        this.numero = numero;
        this.idEndereco = this.id;
        this.id++;
    }

}
