public class codePractiveLoops {
    public static void main(String[] args) {
        int i = 0;
        int ii[] = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        while (i<10) {
            System.out.println(ii[i]);
            i++;
        }
        int bob = ii[8] + ii[9];
        System.out.println(bob);
    }
}