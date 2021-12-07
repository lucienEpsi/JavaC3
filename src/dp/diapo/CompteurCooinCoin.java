/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.diapo;

/**
 *
 * @author 33676
 */
public class CompteurCooinCoin implements EmissionSonore{
    public EmissionSonore monCrieur;
    private static int compteur;

    
    public CompteurCooinCoin(EmissionSonore e){
        monCrieur = e;
    }
    @Override
    public void emetUnSon() {
        monCrieur.emetUnSon();
        compteur++;
    }
    
    public static int getCompteur() {
        return compteur;
    }

   
    
    
}
