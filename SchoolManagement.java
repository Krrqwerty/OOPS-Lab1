// Superclass Person with abstract method performDuty
abstract class Person {
    // Abstract method to be implemented by subclasses
    public abstract void performDuty();
}

// Subclass Student, which overrides the performDuty method
class Student extends Person {
    @Override
    public void performDuty() {
        System.out.println("Student is studying.");
    }
}

// Subclass Teacher, which overrides the performDuty method
class Teacher extends Person {
    @Override
    public void performDuty() {
        System.out.println("Teacher is teaching.");
    }
}

// Main class to test runtime polymorphism
public class SchoolManagement {
    public static void main(String[] args) {
        // Create an array of Person references
        Person[] people = new Person[4];
        
        // Populate the array with instances of Student and Teacher
        people[0] = new Student();
        people[1] = new Teacher();
        people[2] = new Student();
        people[3] = new Teacher();
        
        // Iterate through the array and invoke performDuty()
        for (Person person : people) {
            person.performDuty();  // The appropriate method is called at runtime
        }
    }
}

