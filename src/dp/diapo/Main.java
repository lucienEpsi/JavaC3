/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.diapo;

import dp.diapo.observable.CanardObservable;
import dp.diapo.observable.Chasseur;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 33676
 */
public class Main {
    public static void main(String[] args) {
        List<EmissionSonore> emis = new ArrayList<>();
        emis.add(new Appeau());
        emis.add(new CompteurCooinCoin(new Morillon()));
        emis.add(new CanardC());
        emis.add(new Appeau());
        //emis.add(new CompteurCooinCoin(new Morillon()));
        //emis.add(new CompteurCooinCoin(new Colvert()));
        emis.add(FabriqueCanardVivant.creerColvert());
        emis.add(FabriqueCanardVivant.creerMorillon());
        emis.add(new AdaptateurOie(new Oie()));
        //ajout des canard observable et du chasseur
        CanardObservable c = new CanardObservable(new Colvert());
        CanardObservable m = new CanardObservable(new Morillon());
        Chasseur elmer = new Chasseur();
        c.addObservateur(elmer);
        m.addObservateur(elmer);
        emis.add(m);
        emis.add(c);
        
        for(EmissionSonore e : emis){
            e.emetUnSon();
        }
        
        System.out.println(CompteurCooinCoin.getCompteur());
        
        
    }
}
