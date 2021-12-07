/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.diapo;

/**
 * fabrique simple en opposition avec la fabrique abstraite du diapo
 * qui offr directement les methodes statiques pour la création
 * @author 33676
 */
public class FabriqueCanardVivant {
    
    public static EmissionSonore creerColvert(){
        return new CompteurCooinCoin(new Colvert());
    }
    public static EmissionSonore creerMorillon(){
        return new CompteurCooinCoin(new Morillon());
    }
}
