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

    public static Result show(){
        return ok(data.render(userForm));
    }
    public static Result post(){
        User user=userForm.bindFromRequest().get();

        return ok(data.render(userForm.bindFromRequest()));
    }
}
