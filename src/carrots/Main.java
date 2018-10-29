package carrots;

public class Main {

    public static void main(String[] args) {

        Speakable speakable = new Speakable() {
            @Override
            public void speak(String toSpeak) {
                System.out.println("wenwn");
            }

            @Override
            public String speakMessage(String toSpeak) {
                return "wewn";
            }
        };

        Student s1 = new Student("Ala", "Makota","a9978");
        System.out.println(s1.getName()+ " " + s1.getSurname());


        Person s2 = new Student("Jankov", "Kovalski", "b67582");
        System.out.println(s2.getName()+ " " + s2.getSurname());

        Teacher t1 = new Teacher("Krzys", "Oleo", 2000);
        Person t2 = new Teacher("Kos", "Mos", 800);


        System.out.println("Speakable\n\n\n");

        Speakable[] speakables = new Speakable[3];
        speakables[0] = speakable;
        speakables[1] = s1;
        speakables[2] = t1;

        for (int i = 0; i <speakables.length ; i++) {
            speakables[i].speak("Tralala" + i);
        }
    }
}

