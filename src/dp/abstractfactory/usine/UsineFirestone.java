/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.abstractfactory.usine;

import dp.abstractfactory.Garage;
import dp.abstractfactory.PneuNeige;
import dp.abstractfactory.PneuSport;

/**
 *
 * @author 33676
 */
public class UsineFirestone implements Garage{

    @Override
    public PneuNeige createPneuNeige() {
        return new PneuNeigeFirestone();
    }

    @Override
    public PneuSport createPneuSport() {
        return new PneuSportFirestone();
    }
    
    
}
