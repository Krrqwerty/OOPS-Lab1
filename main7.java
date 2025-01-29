class Student {
    private String name ;
    private int age ;


    public Student() {
        this.name = " Name";
        this.age = 20;
    }

    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class main7 {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.display();

        Student student2 = new Student("Krrish", 20);
        student2.display();
    }
}


