import java.util.Scanner;

public class Prestupny_rok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadejte rok: ");
        int rok = scanner.nextInt();

        // Kontrola přestupného roku podle Wikipedie:
        if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
            System.out.println(rok + " je přestupný rok.");
        } else {
            System.out.println(rok + " není přestupný rok.");
        }

        scanner.close();
    }
}
