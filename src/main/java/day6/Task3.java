package day6;

public class Task3 {
    public static void main(String[] args) {
        Student Nic = new Student();
        Nic.setName("Nic");

        Teacher PetrIvanovich = new Teacher();
        PetrIvanovich.setName("Петр Иванович");
        PetrIvanovich.setSubject("Физика");
        PetrIvanovich.evaluate(Nic);

    }
}
