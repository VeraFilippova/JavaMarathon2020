package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student Anton = new Student("Anton", "A-31");
        System.out.println(Anton.getGroupName());
        Anton.printInfo();

        Teacher Iv = new Teacher("Ivan Vasilevich", "physics");
        System.out.println(Iv.getSubjectName());
        Iv.printInfo();

    }
}
