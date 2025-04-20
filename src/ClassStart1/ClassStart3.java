package ClassStart1;

public class ClassStart3 {


    public static void main(String[] args) {
        Student student1 = null;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grad = 90;

        Student student2 = null;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 15;
        student2.grad = 90;


        Student[] students = new Student[2];

        students[0] = student1;
        students[1] = student2;

        students[0].name = "신선우";

        System.out.println("이름 : " + students[0].name + " 나이 :" + students[0].age + " 학점 : "+ students[0].grad);
        System.out.println("이름 : " + students[1].name + " 나이 :" + students[1].age + " 학점 : "+ students[1].grad);

    }

}

