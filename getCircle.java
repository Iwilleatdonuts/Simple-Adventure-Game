public class getCircle {

    public static void main(String[] args) {
        Circle circle1 = new Circle("Red", 5, 5, 1, 1);
        circle1.setColor("Green");
        System.out.println("The color of your circle is "+circle1.getColor());
        System.out.println("The radius of your circle is "+circle1.getRadius());
        System.out.println("The diameter of your circle is "+circle1.getDiameter());
        System.out.println("The circumference of your circle is "+circle1.getCircumference());
        System.out.println("The area of your circle is "+circle1.getArea());
    }
}
