/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.composite.sport;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 33676
 */
public class ProduitComposite extends Produit {
    private List<Produit> liste = new ArrayList<>();
    public ProduitComposite() {
    }

    public void add(Produit p) {
        liste.add(p);
    }
    
    @Override
    public float getPrix(){
        float total = 0;
        for(Produit p : liste){
            total += p.getPrix();
        }
        return total;
    }
    
}
