public class Circle {
        String co1or;
        double rad1us;
        double diam3ter;
    public Circle(String color, double radius, double diameter, double circumference, double area){
        co1or=color;
        rad1us=radius;
        diam3ter=diameter;
    }
    public String getColor(){
        return co1or;
    }
    public void setColor(String newColor){
        co1or=newColor;
    }
    public double getRadius(){
        return rad1us;
    }
    public double getDiameter(){
        return rad1us*2;
    }
    public double getCircumference(){
        return rad1us*2*3.14159265358979323846264338327950288419716939937510;
    }
    public double getArea(){
        return rad1us*rad1us*3.14159265358979323846264338327950288419716939937510;
    }
}
