public class Circle extends Shape{
    protected double radius;
    private final double PI = Math.PI;

    //constructors

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, double height){
        this.radius = radius;
        super.height = height;
    }
    //implementing the abstract method in Superclass
    public double getArea(){
        double area = PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public void displayshapName(){
        System.out.println("Drawing a Circle of radius " + this.radius);
    }
    // toString returns a self-descriptive String

    @Override
    public String toString(){
        return "Circle[ radius = "+ radius + super.toString() + "]";
    }
}
