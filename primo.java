public class Primo1 {

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

    public static boolean esPrimo2(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
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

        if (esPrimo2(numero)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}