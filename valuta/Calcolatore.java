package valuta;

import java.util.Scanner;

public class Calcolatore {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // messaggio di benvenuto
        System.out.println("Benvenuto nel nostro sistema di valute, inserisci la currency che vuoi cambiare:");
        
        ConvertitoreValute calcolo = new ConvertitoreValute();

        
        // chiudi lo scanner dopo l'uso
        scan.close();

    }
}
