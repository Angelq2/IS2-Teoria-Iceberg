package app;

import java.util.Date;
/**
 *
 * @author angel
 */
public class Iceberg {
    String id;
    Date discovered;
    public Iceberg(String id, Date discovered){
        this.id = id;
        this.discovered = discovered;
    }
    public String getId(){
        return id;
    }
    
    public Date getDiscovered(){
        return discovered;
    }
    
    
}
