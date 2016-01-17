package controllers;

import play.*;
import play.mvc.*;
import java.util.*;

import static scala.collection.JavaConversions.asJavaList;
import static scala.collection.JavaConversions.asScalaBuffer;
import models.*;
import org.joda.time.LocalTime;
import org.joda.time.DateTime;
import org.joda.time.Days;

import views.html.*;

public class Application extends Controller {
    public static Result index(){
        DateTime today=DateTime.now();
        DateTime yesterday=today.minus(Days.ONE);

        List<Item> list1=new ArrayList<Item>();
        List<Item> list2=new ArrayList<Item>();

        Item item1=new Item("qwerty",LocalTime.now(),"hello");
        Item item2=new Item("lilith",LocalTime.now(),"Hi");
        Item item3=new Item("qwerty",LocalTime.now(),"Fine");
        Item item4=new Item("lilith",LocalTime.now(),"Yes");

        list1.add(item1);
        list1.add(item2);

        list2.add(item3);
        list2.add(item4);

        Chat chat11=new Chat(yesterday,1,list1);
        Chat chat22=new Chat(today,2,list2);


        List<Chat> listChat=new ArrayList<Chat>();

        listChat.add(chat11);
        listChat.add(chat22);

        return ok(index.render("It works",asScalaBuffer(listChat)));
    }
}
