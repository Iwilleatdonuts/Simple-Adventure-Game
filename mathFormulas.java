import java.util.Scanner;
public class mathFormulas {
    
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the shape you are trying to find out about 2D or 3D?");
            String dimension = scanner.nextLine();
            if(dimension.equals("2D")) {
                System.out.println("Please type the two-dimensional shape you are trying to find out about.");
                    String twoDimenShape = scanner.nextLine(); 
                    switch(twoDimenShape) {
                        case "square":
                            System.out.println("Are you finding area or perimeter?");
                            String areaOrPerim = scanner.nextLine();
                                if (areaOrPerim.equals("area")) {
                                    System.out.println("What is the length of the square?");
                                    double lenOfSquare = scanner.nextDouble();
                                    double areaOfSquare = lenOfSquare*lenOfSquare;
                                    System.out.println("The area of your square is " + areaOfSquare);
                                } else {
                                    System.out.println("What is the length of the square?");
                                    double lenOfSquare = scanner.nextDouble();
                                    double perimOfSquare = lenOfSquare*4;
                                    System.out.println("The perimeter of your square is " + perimOfSquare);
                                }
                            break;
                        case "triangle":
                            System.out.println("Are you finding area or perimeter?");
                            String areaOrPerimTri = scanner.nextLine();
                                if (areaOrPerimTri.equals("area")) {
                                    System.out.println("What is the length of the base of your triangle?");
                                    double lenOfTri = scanner.nextDouble();
                                    System.out.println("What is the height of your triangle?");
                                    double heightOfTri = scanner.nextDouble();
                                    double areaOfTri = (lenOfTri * heightOfTri) / 2;
                                    System.out.println("The area of your triangle is " + areaOfTri);
                                }
                            break;
                        case "circle":

                            break;
                        case "rectangle":

                            break;
                    }
            } else {
        System.out.println("We are going to find the volume of a cylinder! What is the radius of the circular base?");
            double radius = scanner.nextDouble();
        System.out.println("Next, what is the height of the cylinder?");
            double height = scanner.nextDouble();
            double areaOfBase = radius*radius*Math.PI;
            double volumeOfCylinder = areaOfBase*height;
        System.out.println("The volume of your cylinder is " + volumeOfCylinder);
            }
            scanner.close();
    }
}