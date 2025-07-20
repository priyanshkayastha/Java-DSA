package logics.array;

public class secondSmallest {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 2, 9 };
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];

            }
        }
        System.out.println(ssmallest);
    }
}
