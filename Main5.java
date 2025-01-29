public class Main5 {
    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1; 
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;                                                                                        
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 4, 45, 99, 99, 45};
        System.out.println("Second Largest: " + findSecondLargest(arr1));
        
        int[] arr2 = {5}; 
        System.out.println("Second Largest: " + findSecondLargest(arr2));
        
        int[] arr3 = {7, 7, 7, 7}; 
        System.out.println("Second Largest: " + findSecondLargest(arr3));
    }
}


