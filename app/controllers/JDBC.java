package controllers;

/**
 * Created by qwertylevel3 on 16-1-18.
 */

import play.mvc.*;
import play.*;
import static play.mvc.Result.*;
import play.libs.*;
import java.util.List;

import db.jdbc.SampleDb;

public class JDBC extends Controller{

    public static Result page(){
        return ok(views.html.jdbc.render());
    }

    public static Result table(){
        try{
            SampleDb.createTestTable();
            return ok("table created");
        }catch(Exception e){
            return internalServerError(e.getMessage());
        }
    }

    public static Result test(Integer value){
        try{
            SampleDb.insertTestData(value.toString());
            List<String> vs =SampleDb.getTestData();
            return ok(Json.toJson(vs));
        }catch(Exception e){
            return internalServerError(e.getMessage());
        }
    }
}
