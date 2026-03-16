public class Primo1 {

   public static boolean esPrimo3(int n) {

        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static boolean esPrimo(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int numero = 17;

        if (esPrimo(numero)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

    }
}