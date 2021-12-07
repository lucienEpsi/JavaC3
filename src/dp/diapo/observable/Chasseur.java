/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.diapo.observable;

/**
 *
 * @author 33676
 */
public class Chasseur implements Observateur {

    @Override
    public void reagit(Observable o) {
        System.out.println("Je tire les yeux fermés");
    }
   
    
}
