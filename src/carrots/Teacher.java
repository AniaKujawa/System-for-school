package carrots;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, String surname, int salary) {
        super(name, surname);

        this.salary = salary;
    }

    @Override
    public String saySomething(String say) {
        return "Nauczyciel mówi: " + say + "!!!!";
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.salary + " ";
    }

    @Override
    public void speak(String toSpeak) {
        System.out.println("Nauczyciel: " + toSpeak);
    }

    @Override
    public String speakMessage(String toSpeak) {
        return "Nauczyciel: " + toSpeak;
    }
}
