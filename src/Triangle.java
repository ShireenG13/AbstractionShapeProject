public class Triangle extends Shape{


    public Triangle(){}
    public Triangle(String color){
        super.color = color;
    }
    //setter
    public void setBase(double base){
        this.base = base;
    }

    @Override //abstract method
    public double getArea(){
        return 0.5*super.base* super.height;
    }
    @Override //overriding non-abstract method of base class with different impl
    public void displayshapName(){
        System.out.println("I am a Triangle");
    }
    @Override //main function's toString method

    public String toString(){
        return "Triangle [ base = "+ super.base + ", height = " + super.height + ", " + super.toString()+ "]";
    }
}
