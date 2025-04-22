public class panduan {

    public static boolean sushu(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        System.out.println("100到200之间的素数有：");
        for (int i = 100; i <= 200; i++) {
            if (sushu(i)) { 
                System.out.print(i + " ");
            }
        }
    }
}