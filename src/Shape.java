public abstract class Shape {
    protected String color;
    protected double height;
    protected double width;
    protected double base;

    // Setters
    public void setColor(String color) {
        this.color = color;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setBase(double base) {
        this.base = base;
    }

    //abstract getArea method
    //abstract methods must be overriden in a subclass
    //All shapes must provide implementation for a method called getArea
    public abstract double getArea();

    //toString method. Returns a self-descriptive String

    public String toString(){
        return "Shape[color=" + color + "]";
    }

    public void displayshapName(){
        System.out.println("I am a shape.");
    }
}
