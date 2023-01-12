package person;

public class Person {
    private int yearOfBirth;
    private String city;
    private String name;
    private String position;


    public Person(){
    }

    public Person(Integer dateOFBirth,String city, String name) {
        this.yearOfBirth = dateOFBirth;
        this.city = city;
        this.name = name;
    }

    public Person(int yearOfBirth, String city, String name, String position) {
        this.yearOfBirth = yearOfBirth;
        this.city = city;
        this.name = name;
        this.position = position;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
