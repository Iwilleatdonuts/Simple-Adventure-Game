import java.util.Arrays;
public class sortingArrays {
    
    public static void main(String[] args) {
        int[] foo = {654, 5, 754, -4, 542, -6524};
        for(int i: foo){
            System.out.print(i + " ");
        }
        System.out.println("");
        Arrays.sort(foo);
        for(int i : foo){
            System.out.print(i + " ");
        }
    }
}
