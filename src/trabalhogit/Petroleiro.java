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
public class Petroleiro extends Navio {
       
    private float capacidadeCarga;
    
    //Construtor´
    public Petroleiro(String matricula){
        super(matricula);
        capacidadeCarga=0;
    }
    
    //Getters
    public float getCapacidadeCarga(){
        return capacidadeCarga;
    }
    
    //Setter
    public void setCapacidadeCarga(float capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
        
    }
    
    @Override
    public String toString(){
        return super.toString() + "Petroleiro{" + "capacidadeCarga=" + capacidadeCarga + '}';
    }
    
}
