import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz = 0.95;
        double Patlican = 5.00;
        double Toplam;
        double kgArmut, kgElma, kgDomates, kgMuz,kgPatlican;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kilo: ");
        kgArmut = inp.nextFloat();

        System.out.print("Elma kilo: ");
        kgElma= inp.nextFloat();

        System.out.print("Domates kilo: ");
        kgDomates = inp.nextFloat();

        System.out.print("Muz kilo: ");
        kgMuz = inp.nextFloat();

        System.out.print("Patlican kilo: ");
        kgPatlican = inp.nextFloat();

        Toplam = (Armut * kgArmut) + (Elma * kgElma) + (Domates * kgDomates) + (Muz * kgMuz) + (Patlican * kgPatlican);

        System.out.println("\n Toplam Tutar: " + Toplam);
    }
}
