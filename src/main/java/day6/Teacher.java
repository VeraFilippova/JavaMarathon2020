package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    private String appraisal;

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    void evaluate(Student student) {
        int[] appraisalStudet = new int[1];
        Random numbers = new Random();
        for (int i = 0; i < appraisalStudet.length; i++) {
            appraisalStudet[i] = numbers.nextInt(4) + 2;
            switch (appraisalStudet[i]) {
                case 2:
                    appraisal = "неудовлетворительно";
                    break;
                case 3:
                    appraisal = "удовлетворительно";
                    break;
                case 4:
                    appraisal = "хорошо";
                    break;
                case 5:
                    appraisal = "отлично";
                    break;
            }

        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getStudentname() + " по предмету " + subject + "  на оценку " + appraisal);
    }
}
