package controllers;

import play.*;
import play.mvc.*;
import java.util.*;

import static scala.collection.JavaConversions.asScalaBuffer;
import models.Item;
import org.joda.time.LocalTime;

import views.html.*;

public class Application extends Controller {
    public static Result index(){
        int level=1;

        List<Item> list=new ArrayList<Item>();
        list.add(new Item("qwertylevel0",LocalTime.now(),"itme 0"));
        list.add(new Item("qwertylevel1",LocalTime.now(),"itme 1"));
        list.add(new Item("qwertylevel2",LocalTime.now(),"itme 2"));
        list.add(new Item("qwertylevel3",LocalTime.now(),"itme 3"));

        return ok(index.render("It works",level,asScalaBuffer(list)));
    }
}
