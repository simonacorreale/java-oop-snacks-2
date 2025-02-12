package valuta;

import java.util.Scanner;

public class Calcolatore {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // messaggio di benvenuto
        System.out.println("Benvenuto nel nostro sistema di valute, inserisci la currency che vuoi cambiare:");
        
        // Input dell'utente
        String valuta = scan.nextLine();
        
        // visualizza la valuta inserita
        System.out.println("Hai scelto la valuta: " + valuta);
        
        // chiudi lo scanner dopo l'uso
        scan.close();

    }
}
