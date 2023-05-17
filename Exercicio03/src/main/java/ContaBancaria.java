public class ContaBancaria {
    private double saldo;
    private String nome;
    public float valorChequeEspecial;

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
    
    public float calculaValorChequeEspecial(float pValorChequeEspecial, float pQuantidadeCheque){
        float resultado = pValorChequeEspecial * pQuantidadeCheque;
        return resultado;
    }
}

