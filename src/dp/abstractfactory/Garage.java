/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.abstractfactory;

/**
 *
 * @author 33676
 */
public interface Garage {
    public PneuNeige createPneuNeige();
    public PneuSport createPneuSport();
}