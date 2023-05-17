import java.util.*;
public class ContaCorrente extends ContaBancaria{
    private int conta;
    private int agencia;

    @Override
    public float calculaValorChequeEspecial(float pValorChequeEspecial, float pQuantidadeCheque) {
        return super.calculaValorChequeEspecial(pValorChequeEspecial, pQuantidadeCheque);
    }
    
    
}
