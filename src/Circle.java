public class Circle {
    int radius;
    Circle(int radius){
        this.radius= radius;
    }
    public double circumference(){
        return 2*3.14f*radius;
    }
    public double area(){
        return 3.14f * radius* radius;
    }

    public static void main(String[] args) {
        Circle c= new Circle(5);
        System.out.println("circumference: "+c.circumference());
        System.out.println("area: "+c.area());
    }
}
