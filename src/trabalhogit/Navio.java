/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhogit;

/**
 *
 * @author tiagofigueiredo
 */
public class Navio {
    private String matricula, nome;
    float comprimento;
    
    //Construtor 
    public Navio(String matricula){
        this.matricula = matricula;
        nome = "";
        comprimento = 0;
    }
    
    
    //Getters
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public float getComprimento() {
        return comprimento;
    }
    
    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Navio{" + "matricula=" + matricula + ", nome=" + nome + ", comprimento=" + comprimento + '}';
    }
    
    
    
    
    
    
}
