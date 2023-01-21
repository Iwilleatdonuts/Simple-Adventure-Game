public class Employee {
    String lastN;
    String firstN;
    double iD;
    double salary;
    public Employee(String lastN, String firstN, double iD, double salary){
        this.lastN=lastN;
        this.firstN=firstN;
        this.iD=iD;
        this.salary=salary;
    }
    public String getLastName(){
        return lastN;
    }
    public String getFirstName(){
        return firstN;
    }
    public double getID(){
        return iD;
    }
    public double getSalary(){
        return salary;
    }
    public void raiseSalary(double salaryRaise){
        salary=((salaryRaise/100)+1)*salary;
    }
}
