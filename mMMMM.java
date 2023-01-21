import java.util.Arrays;
public class mMMMM {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};
        int count = 0;
        int min = data[0];
        while (count < data.length){
            if (min > data[count]){
                min = data[count];
            }
            count++;
        }
        System.out.println("The lowest number in this array is "+ min);
        count = 0;
        int max = data[0];
        while (count < data.length){
            if (max < data[count]){
                max = data[count];
            }
            count++;
        }
        System.out.println("The highest number in this array is "+max);
    
    count = 0;
    double mean = 0;
        while (count < data.length){
            mean = data[count] + mean;
            count++;
        }
        mean = mean/data.length;
        System.out.println("The average of this array is "+mean);
        Arrays.sort(data);
        
}
}