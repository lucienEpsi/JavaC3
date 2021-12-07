/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.diapo.observable;

import dp.diapo.EmissionSonore;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 33676
 */
public class CanardObservable implements EmissionSonore, Observable{
    private EmissionSonore decore;

    private List<Observateur> liste = new ArrayList<>();
    
    public CanardObservable(EmissionSonore decore) {
        this.decore = decore;
    }
    
    
    @Override
    public void emetUnSon() {
        decore.emetUnSon();
        notifier();
    }

    @Override
    public void addObservateur(Observateur o) {
        liste.add(o);
    }

    @Override
    public void notifier() {
        for(Observateur o : liste){
            o.reagit(this);
        }
    }
    
}
