
package com.mycompany.heranca;

/**
 * 4 Crie uma classe chamada Funcionario com Atributos privbados como nome e salario. 
 * Utilize encapsulamento para permitir o acesso a esses atributos por meio de metodos getter e setters
 * @author eduro
 */
public class Funcionario {
    private  float salario;
    private String nome;
    public Funcionario( String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }
    public float getSalario(){
        return salario;
    }
    public String getNome(){
        return nome;
    }
    public  void setSalario(float salario){
        this.salario = salario;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
