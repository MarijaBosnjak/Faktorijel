package Faktorijel;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Napiši Java program koji omogućuje korisniku unos broja, a zatim računa faktorijel tog broja.
Program treba obraditi iznimke koje se mogu pojaviti tijekom unosa i računanja faktorijela.
Ispiši poruku korisniku da unese broj.
Koristi Scanner za unos broja od korisnika.
Obradi iznimke koje se mogu pojaviti tijekom unosa. Ako korisnik unese nešto što nije broj,
ispiši odgovarajuću poruku i zatraži ponovni unos.
Računaj faktorijel unesenog broja.
Obradi iznimke koje se mogu pojaviti tijekom računanja faktorijela. Na primjer,
obradi situaciju kada korisnik unese negativan broj jer faktorijel nije definiran za negativne brojeve.
Ispiši rezultat ili poruku o greški, ovisno o tome je li računanje faktorijela uspješno ili ne.*/
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         try{ System.out.println("Unesi neki broj");
             int n=sc.nextInt();
             if (n < 0) {
                 throw new IllegalArgumentException("Faktorijel nije definiran za negativne brojeve.");
             }
             int faktorijel = 1;
             for (int i = 1; i <= n; i++) {
                 faktorijel *= i;
             }
             System.out.println("Faktorijel unesenog broja je " +faktorijel);

         }
         catch (InputMismatchException e){
             System.out.println ("Unjeli ste pogrešan unos, molimo vas unesite broj ");

         }
         catch (IllegalArgumentException e){
             System.out.println("Nemoguć unos negativnih brojeva");

         }

    sc.close();
    }
}
