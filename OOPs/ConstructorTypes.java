public class ConstructorTypes{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Asad");
        Student s3 = new Student(122);
        // System.out.println(s1.name);
    }
}

class Student{
    String name;
    int roll;

    // Constructor:- constructor is a special method which is invoked automatically at the time of object creation.


    // type of Constructor

    // Non-Parametrized :- No Argument and No Parameter will taken
    Student(){
        System.out.println("constructr is called..");
    }

    // Parametrized :-  Argument and  Parameter will taken

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }

}