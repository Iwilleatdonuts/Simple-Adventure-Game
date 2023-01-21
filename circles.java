import java.util.Scanner;
public class circles {
    static void circlessdsd(double radius){
        double diameter = radius*2;
        double circumference = diameter*3.14;
        double area = radius*radius*3.14;
        System.out.println("The diameter of a circle with a radius of "+radius+" is "+diameter);
        System.out.println("The circumference of a circle with a radius of "+radius+" is "+circumference);
        System.out.println("The area off a circle with a radius of "+radius+" is "+area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        double radius = scanner.nextDouble();
        circlessdsd(radius);
        scanner.close();
    }
}
