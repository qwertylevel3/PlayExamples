package models;

/**
 * Created by qwerty on 16-1-16.
 */

import org.joda.time.LocalTime;


public class Item {
    public String user;
    public LocalTime timestamp;
    public String message;

    public Item(String user,LocalTime timestamp,String message){
        this.user=user;
        this.timestamp=timestamp;
        this.message=message;
    }
}
