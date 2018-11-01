public class Circle {
    private double radius=1.0;
    private String color="red";
    private boolean filled=true;

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    Circle(){}
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius, String color, boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }

    @Override
    public String toString() {
        return "Circle with radius: "+radius+", color: "+color+", and filled: "+filled;
    }
}
