package controllers;

import play.*;
import play.mvc.*;

import static scala.collection.JavaConversions.asScalaBuffer;

import views.html.*;

public class Application extends Controller {
    public static Result index(){
        int level=1;
        java.util.List<String> list=java.util.Arrays.asList("me","and you","tea","for two");
        return ok(index.render("It works",level,asScalaBuffer(list)));
    }
}
