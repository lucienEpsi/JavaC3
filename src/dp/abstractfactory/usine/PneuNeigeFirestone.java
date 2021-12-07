/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.abstractfactory.usine;

import dp.abstractfactory.PneuNeige;

/**
 *
 * @author 33676
 */
public class PneuNeigeFirestone implements PneuNeige {
    private String nom = "Firestone Neige FN4";
    public PneuNeigeFirestone() {
    }

    @Override
    public String toString() {
        return "PneuNeigeFirestone{" + "nom=" + nom + '}';
    }
    
    
    
}
