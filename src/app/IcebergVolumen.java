package app;

import java.util.Date;

/**
 *
 * @author angel
 */
public class IcebergVolumen implements IcebergEvent{
    
    public final double volume;
    
    public IcebergVolumen(double volume){
        this.volume = volume;
    }
    @Override
    public Date fecha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iceberg iceberg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
