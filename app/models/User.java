package models;

/**
 * Created by qwerty on 16-1-17.
 */

import java.util.List;
import play.libs.F.Option;

public class User {
    public String name;
    public Integer age;
    public Boolean female;
    public Address address = new Address();
    public List<User> friends;
    public Option<User> spouse;
}
