package logics.array;

public class secondLarge {
    int arr[];

    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 7, 5 };

        int largest = arr[0];
        int slargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        System.out.println(slargest);

    }
}
