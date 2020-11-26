package app;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Repository {
    ArrayList<Iceberg> arrayIceberg;
    ArrayList<IcebergEvent> arrayIceberEvent;

    public Repository(ArrayList<Iceberg> arrayIceberg, ArrayList<IcebergEvent> arrayIceberEvent) {
        this.arrayIceberg = arrayIceberg;
        this.arrayIceberEvent = arrayIceberEvent;
    }
    
}
