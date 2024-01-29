public class Main {
    public static void main(String[] args) {
        printtriangle(5, 5);
    }
}

    public static void printtriangle(int length, int max) {
        for (int i = 1; i <= (length); i++) {
            System.out.print(" * ");
            for (int j = i + 1; j <= max; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }