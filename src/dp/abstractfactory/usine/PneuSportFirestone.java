/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.abstractfactory.usine;

import dp.abstractfactory.PneuSport;

/**
 *
 * @author 33676
 */
public class PneuSportFirestone implements PneuSport {
    private String nom ="Firestone Sport F1";
    public PneuSportFirestone() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PneuSportFirestone{nom=").append(nom);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
