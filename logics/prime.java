package logics;

public class prime {
    public static void main(String[] args) {
        int no = 17;
        int temp = 0;

        if (no <= 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i < no; i++) {
                if (no % i == 0) {
                    temp = 1;
                    break; // No need to check further
                }
            }

            if (temp == 1) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Number is prime");
            }
        }
    }
}
