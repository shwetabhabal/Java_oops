public class Employee {
    String name;
    int sal;
    int id;
    public int calSalary(int sal){
        return sal*12;
    }
    public void print(String name,int sal){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+sal);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        String name="John";
        int sal= 5000;
        int id= 12121;

        System.out.println("Salary"+e.calSalary(sal));
        e.print(name,sal);
    }
}
