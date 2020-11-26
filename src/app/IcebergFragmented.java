package app;

import java.util.Date;

/**
 *
 * @author angel
 */
public class IcebergFragmented implements IcebergEvent{

    public final Iceberg fragments;
    
    public IcebergFragmented(Iceberg fragments){
        this.fragments = fragments;
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
