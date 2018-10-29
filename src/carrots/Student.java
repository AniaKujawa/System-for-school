package carrots;

public class Student extends Person {
    private String studentId;

    public Student(String name, String surname, String studentId) {
        super(name, surname);
        this.studentId = studentId;
    }

    @Override
    public String saySomething(String say) {
        return "Student mówi: " + say;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.studentId;
    }

    @Override
    public void speak(String toSpeak) {
        System.out.println("Student: " + toSpeak);
    }

    @Override
    public String speakMessage(String toSpeak) {
        return "Student " + toSpeak;
    }
}
