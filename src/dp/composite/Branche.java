/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 33676
 */
public class Branche extends Cellulose{
    //en que composite je possede une liste de composants
    private List<Cellulose> liste = new ArrayList<>();
    
    @Override
    public void afficheToi() {
        System.out.println("Branche");
        for(Cellulose c : liste){
            System.out.print("\t");
            c.afficheToi();
        }
    }
    
    public void add(Cellulose c){
        liste.add(c);
    }
    
}
