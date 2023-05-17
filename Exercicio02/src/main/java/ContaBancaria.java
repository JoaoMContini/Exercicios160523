/*
2 Crie uma classe chamada contBancaria  com atributos privados, como saldo e tiutular. Utilize encapsulamento 
para permitir o acesso a esses atributos por meio de metodos getters e setter
*/

public class ContaBancaria {
    private double saldo;
    private String nome;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

