/*
 Classe concreta Asciugatrice.
 Estende Elettrodomestico.
*/

public class Asciugatrice extends Elettrodomestico {

    private int capacitaKg;

    public Asciugatrice(String classeEnergetica, float consumoGiornaliero, int capacitaKg) {
        super("Asciugatrice", classeEnergetica, consumoGiornaliero);
        this.capacitaKg = capacitaKg;
    }

    @Override
    public String getDescrizione() {
        return nome + " | " + capacitaKg + " kg | Classe " + classeEnergetica;
    }
}