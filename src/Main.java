import java.util.Arrays;

/**
 * Created by KPS on 7/24/2020.
 */
public class Main {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4};
        int[] ints2 = new int[4];
        for (int i = 0 ; i < ints.length ;i++){
            ints2[i] = ints[i];
        }
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints2));
    }
}
