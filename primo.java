public class Primo1 {

    public static boolean esPrimo3(int n) {

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

        if (esPrimo3(numero)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

        if (esPrimo3(numero)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}