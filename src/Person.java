import java.util.ArrayList;

public class Person implements Cloneable {
    private String name;
    private int age;
    private ArrayList<String> hobbies;
    protected Person() {
        this("John Doe", 20);
    }
    protected Person(String name, int age) {
        this.name = name;
        this.age = age;
        hobbies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }
    public void removeHobby(String hobby) {
        if(hobbies.contains(hobby))
            hobbies.remove(hobby);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();

        person.hobbies = new ArrayList<>(hobbies);

        return person;
    }
}
