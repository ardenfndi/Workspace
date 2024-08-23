package Q1;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private String city;
    private List<String> hobbies;

    public Person(String name, int age, String city, List<String> hobbies) {
        this.name = name;
        this.age =age;
        this.city = city;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getHobbies(){
        return hobbies;
    }

    public void addHoby(String hobby){
        hobbies.add(hobby);
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age + ", City: " + city + ", Hobbies: " + hobbies;
    } 


}
