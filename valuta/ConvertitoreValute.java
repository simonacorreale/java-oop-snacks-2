/* Sistema di Conversione Valute
Crea una classe ConvertitoreValute che contenga un array di tassi di cambio (es. da EUR a USD, GBP, JPY...) dichiarato come final static per impedire modifiche.
Implementa un metodo static double converti(String da, String a, double importo), che accetta la valuta di partenza, quella di destinazione e l'importo da convertire, restituendo il valore convertito.
Il programma deve accettare input dall’utente (valuta di partenza, valuta di destinazione, importo) e restituire l’importo convertito.
 */

package valuta;

public class ConvertitoreValute {

    private final static String[] CURRENCY_EXE = {"EUR", "USD", "GBP", "JPY"} ;

    private static final double[][] tassiCambio = {
        {1.0, 1.1, 0.85, 134.0},  // Tassi di cambio da EUR a USD, GBP, JPY
        {0.9, 1.0, 0.78, 122.0},  // Tassi di cambio da GBP a EUR, USD, JPY
        {1.2, 1.3, 1.0, 157.0},   // Tassi di cambio da JPY a EUR, USD, GBP
    };
    
}
