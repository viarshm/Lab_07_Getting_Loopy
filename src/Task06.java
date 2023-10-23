public class Task06 {
    public static void main(String[] args) {
        {
            int rows = 5;
            int i;
            int j;
            for (i = 1; i <= 5; i++) {
                for (j = 1; j <= (rows - i + 1); j++)

                    System.out.print("*");
                System.out.println();

            }
        }
    }
}