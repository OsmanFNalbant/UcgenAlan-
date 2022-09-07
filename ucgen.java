import java.util.Scanner;
public class ucgen {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double pi = 3.14,alan;
        int r,a;
        System.out.println("Yaricap uzunlugu:");
        r = input.nextInt();
        System.out.println("Daire diliminin acisi:");
        a = input.nextInt();
        alan = pi *r*r*a / 360;
        System.out.println("Dilimin Alanı:" +alan);
    }
    /* www.patika.dev */
}