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
public class AdaptateurSamSaoule implements IChargeable{
    private PortableSamSaoule sam;
    public AdaptateurSamSaoule(PortableSamSaoule sam) {
        this.sam = sam;
    }

    @Override
    public void Recharger(int volts) {
        sam.ChargerPortable(volts);
    }
    
}
