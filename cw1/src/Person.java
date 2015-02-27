/**
 * Created by crystal on 2/25/15.
 */
public class Person {
    String name;

    public Person(String personName) {
        this.name = personName;
    }

    public String greet(String yourName) {
        return String.format("Hi %s, my name is %s", yourName, name);
    }
}
