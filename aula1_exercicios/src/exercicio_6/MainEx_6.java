package exercicio_6;

public class MainEx_6 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Diogo");
        Cliente cliente2 = new Cliente("Carlos");
        cliente1.addEndereco("minha casa", "Rua Mato Grosso", 1050);
        System.out.println(cliente1);
    }
}
