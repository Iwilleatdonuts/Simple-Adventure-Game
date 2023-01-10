public class testRNG {
    public static void main(String[] args) {
       for(int i =0;i<100;i++){
        int rng = (int)Math.round((Math.random())*100);
        System.out.println(rng);
       }
    }
}
