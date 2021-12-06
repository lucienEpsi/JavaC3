/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptateur;

/**
 *
 * @author 33676
 */
public class AdaptateurSonneEricSonne implements IChargeable{
    private PortableSonneEricSonne erick;
    public AdaptateurSonneEricSonne(PortableSonneEricSonne erick) {
        this.erick = erick;
    }

    @Override
    public void Recharger(int volts) {
        erick.ChargerBatteries(5);
    }
    
}
