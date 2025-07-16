public class Patterns {
    public static void main(String[] args) {
       
       //Solid rectangle 
        int n = 4;
        int m = 5;

        // outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}