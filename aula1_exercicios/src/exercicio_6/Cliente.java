package exercicio_6;

import java.util.HashMap;
import java.util.Map;

public class Cliente {
    private static int classID = 0;

    private int clienteID;
    private String nomeCliente;
    private Map<String, Endereco> endereco = new HashMap<String, Endereco>();

    Cliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
        this.clienteID = this.classID;
        this.classID++;
    }

    public void addEndereco(String nome, String endereco, Integer num){
        Endereco endereco1 = new Endereco(endereco, num);
        this.endereco.put(nome, endereco1);
    }

    public int getId(){
        return this.clienteID;
    }
    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public String getEndereco(String nome){
        return this.endereco.get(nome).toString();
    }

    public Integer getQuantidadeDeEnderecos(){
        return this.endereco.size();
    }

    @Override
    public String toString(){
        return "Cliente: " + getNomeCliente() + "  id: " + getId();
    }





}
