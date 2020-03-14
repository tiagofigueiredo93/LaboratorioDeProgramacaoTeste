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
public class PortaContentores extends Navio {
    private int maxContentores;
    
    //Contrutor
    
    public PortaContentores(String Matricula){
        super(Matricula);
        maxContentores = 0;
    }
       
    //Getter
    public int getMaxContentores() {
        return maxContentores;
    }
    
    //Setter
    public void setMaxContentores(int maxContentores) {
        this.maxContentores = maxContentores;
    }

    @Override
    public String toString() {
        return "PortaContentores{" + "maxContentores=" + maxContentores + '}';
    }
    
    
    
    
    
}
