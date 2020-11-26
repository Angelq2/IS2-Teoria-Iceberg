package app;

import java.util.Date;

/**
 *
 * @author angel
 */
public class IcebergPosition implements IcebergEvent{
    public final double x;
    public final double y;
    
    public IcebergPosition(double x, double y){
        this.x = x;
        this.y = y;
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
