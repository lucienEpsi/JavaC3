/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.diapo.observable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 33676
 */
public interface Observable {
    public void addObservateur(Observateur o);
    
    public void notifier();
    
}
