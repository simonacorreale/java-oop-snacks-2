/* Sistema di Conversione Valute
Crea una classe ConvertitoreValute che contenga un array di tassi di cambio (es. da EUR a USD, GBP, JPY...) dichiarato come final static per impedire modifiche.
Implementa un metodo static double converti(String da, String a, double importo), che accetta la valuta di partenza, quella di destinazione e l'importo da convertire, restituendo il valore convertito.
Il programma deve accettare input dall’utente (valuta di partenza, valuta di destinazione, importo) e restituire l’importo convertito.
 */

 /* 1. Creare una matrice dei tassi di cambio
    2. Creare una funzione `converti` che prenda come parametri:
   - la valuta di partenza (`da`),
   - la valuta di destinazione (`a`),
   - l'importo da convertire (`importo`).
    3. Verificare che le valute siano valide (mappandole agli indici).
    4. Calcolare l'importo convertito moltiplicando per il tasso di cambio.
    5. Restituire l'importo convertito.
    6. Se le valute non sono valide, restituire un errore.
    7. Creare una funzione `main` che chieda all'utente di inserire le informazioni (valuta di partenza, valuta di destinazione, importo).
    8. Stampare il risultato o il messaggio di errore.
 */
package valuta;

public class ConvertitoreValute {

    private static final double[][] tassiCambio = {
  
        {1.0, 1.1, 0.85, 134.0},  // Tassi di cambio da EUR a USD, GBP, JPY
        {0.9, 1.0, 0.78, 122.0},  // Tassi di cambio da GBP a EUR, USD, JPY
        {1.2, 1.3, 1.0, 157.0},   // Tassi di cambio da JPY a EUR, USD, GBP
    };
    
}
