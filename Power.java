public class Power {
    int firstN;
    int secondN;
    public Power(int firstN, int secondN){
        this.firstN=firstN;
        this.secondN=secondN;
    }
    public void powerOf(){
        System.out.println(Math.pow(firstN, secondN));
    }
}
