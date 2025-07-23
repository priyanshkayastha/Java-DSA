package logics;

public class palindrome {
    public static void main(String[] args) {
        int no = 1231;
        int temp = no;
        int revNo = 0;
        while (temp != 0) {
            int rem = temp % 10;
            revNo = revNo * 10 + rem;
            temp = temp / 10;
        }
        if (no == revNo) {
            System.out.println("Palindrome no");
        } else {
            System.out.println("Not a Palindrome no");

        }
    }
}
