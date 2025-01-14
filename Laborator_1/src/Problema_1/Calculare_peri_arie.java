package Problema_1;
import java.util.Scanner;
public class Calculare_peri_arie {
    public static void main(String[] args) {
        // Creăm un obiect Scanner pentru a citi datele de la tastatură
        Scanner scanner = new Scanner(System.in);

        // Solicităm utilizatorului să introducă lungimea
        System.out.print("Lungime dreptunghi: ");
        double lungime = scanner.nextDouble();

        // Solicităm utilizatorului să introducă lățimea
        System.out.print("Latime dreptunghi: ");
        double latime = scanner.nextDouble();

        // Calculăm perimetrul
        double perimetru = 2 * (lungime + latime);

        // Calculăm aria
        double aria = lungime * latime;

        // Afișăm rezultatele
        System.out.println("Perimetrul dreptunghiului: " + perimetru);
        System.out.println("Aria dreptunghiului: " + aria);

        // Închidem scannerul pentru a elibera resursele
        scanner.close();
    }
}
