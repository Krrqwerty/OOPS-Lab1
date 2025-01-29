import java.util.Arrays;


public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().sorted().toArray();
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,5,5,3,2,7,2,8,7,5};
        System.out.println("Unique Sorted Array: " + Arrays.toString(removeDuplicates(arr)));
    }
}
    

