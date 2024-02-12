public class Student {
    String name ;
    int age;
    int id;
    Student(String name, int age, int id){
        this.name= name;
        this.age= age;
        this.id= id;
    }
    public void print(){
        System.out.println("Name of student: " +name);
        System.out.println("Age of student: " +age);
    }

    public static void main(String[] args) {
        Student s= new Student("john" , 20, 1212);
        s.print();
    }
}
