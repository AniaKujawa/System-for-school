package carrots;

public abstract class Person implements Speakable {

    private String name;
    private String surname;


    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }


    public abstract String saySomething(String say);



    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }

}
