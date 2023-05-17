public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(double bonus, String nome) {
        super(nome);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
     
    
}
