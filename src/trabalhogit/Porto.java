/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhogit;

import java.util.*;



/**
 *
 * @author tiagofigueiredo
 */
public class Porto {
       
    private List<Navio> navios;
    
    
    //Construtor
    public Porto(){
        navios = new ArrayList<>();
    }
    
    
    //Adiciona Navio
    public void addNavio(Navio n){
        
        if(!procura(n))
            navios.add(n);
        else
            System.out.println("Matricula " + n.getMatricula() + "Já existe!");
    }
    
    
    //Procura navio
    private boolean procura(Navio nv) {
        for(Navio n:navios){
            if(n.getMatricula().equals(nv.getMatricula())) return true;
        }
        return false;
    }
    
    public int getMaxContentores() {
        int ct = 0;
        
        for(Navio n:navios)
            if(n instanceof PortaContentores)
                ct += ((PortaContentores) n).getMaxContentores();
        
        return ct;
    }
    
    public float getTotalCarga(){
        float ct = 0;
        
        for(Navio n:navios){
            if(n instanceof PortaContentores)
                ct += ((PortaContentores) n).getMaxContentores() * 10f;
            if(n instanceof Petroleiro)
                ct += ((Petroleiro) n).getCapacidadeCarga();
        }
        return ct;
     } 
    
    public void listNavios(){
        for(Navio n:navios){
            System.out.println(n);
        }
            
    }
    
    
    
    
    
}
