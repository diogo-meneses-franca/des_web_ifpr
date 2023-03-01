package exercicio_4;

public class mainFolhaDePagamento {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Diogo", 220, 5);
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento(funcionario);
        folhaDePagamento.getFolhaDePagamento();
    }
}
