public class EmployeeData {
    
    public static void main(String[] args) {
        Employee em1 = new Employee("Earl", "Bobby", 69420, 696969.42);
        Employee em2 = new Employee("Chadwick", "Chad", 00001, 1000000000);
        Employee OO7 = new Employee("Bond", "James",0.07, 007);
        em2.raiseSalary(34);
        System.out.println(em1.getLastName()+", "+em1.getFirstName()+". Employee number "+em1.getID()+", salary of $"+em1.getSalary());
        System.out.println(em2.getLastName()+", "+em2.getFirstName()+". Employee number "+em2.getID()+", salary of $"+em2.getSalary());
        System.out.println(OO7.getID());
    }
}
