package controllers;

import play.mvc.*;
import play.data.Form;
import play.libs.*;
import models.*;
import play.data.validation.*;
import static play.data.validation.Constraints.*;
import javax.validation.*;
import views.html.*;
import java.util.*;

/**
 * Created by qwerty on 16-1-17.
 */
public class Data extends Controller{
    static Form<User> userForm = Form.form(User.class);

    public static Result test(){
        Map<String,String> toBind = new HashMap<String,String>();
        toBind.put("name","Siegfried");

        User user = userForm.bind(toBind).get();

        return ok(data.render(user));
    }
}
