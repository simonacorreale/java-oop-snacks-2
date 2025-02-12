package concessionario;


public class Concessionario {
    
public static void main(String[] args) {


        Auto auto1 = new Auto("Fiat 500");
        Auto auto2 = new Auto("Audi A4");
        Auto auto3 = new Auto("BMW X5");
        Auto auto4 = new Auto("Mercedes");

        System.out.println(/* String.format( */"Auto 001 - Modello: " + auto1.getModello() + ", Numero Telaio: " + auto1.getNumeroTelaio()/* ) */);
        System.out.println(/* String.format( */"Auto 002 - Modello: " + auto2.getModello() + ", Numero Telaio: " + auto2.getNumeroTelaio()/* ) */);
        System.out.println(/* String.format( */"Auto 003 - Modello: " + auto3.getModello() + ", Numero Telaio: " + auto3.getNumeroTelaio()/* ) */);
        System.out.println(/* String.format( */"Auto 004 - Modello: " + auto4.getModello() + ", Numero Telaio: " + auto4.getNumeroTelaio()/* ) */);
        System.out.println("Numero auto nel concessionario di Zimona: " + Auto.getNumeroTotaleAuto());
        
}


}
