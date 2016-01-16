package models;

import java.util.*;
import play.data.validation.Constraints.*;

/**
 * Created by qwerty on 16-1-15.
 */
public class Task {
    public Long id;
    @Required
    public String label;

    public static List<Task> all(){
        return new ArrayList<Task>();
    }

//    public static void create(Task task){
//        return ok(
//            views.html.index.render(Task.all(),taskForm)
//        );
//    }

    public static void delete(Long id){

    }
}
