public class testingThings {
    String carModel = "Normal Car No.1342";
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        System.out.println("This car is a "+myCar.carBrand+", "+myCar.carModel);
    }
}
