/*
 Classe concreta Lavatrice.
 Estende Elettrodomestico e aggiunge la capacità in kg.
*/

public class Lavatrice extends Elettrodomestico {

    private int capacitaKg;

    public Lavatrice(String classeEnergetica, float consumoGiornaliero, int capacitaKg) {
        super("Lavatrice", classeEnergetica, consumoGiornaliero);
        this.capacitaKg = capacitaKg;
    }

    @Override
    public String getDescrizione() {
        return nome + " | " + capacitaKg + " kg | Classe " + classeEnergetica;
    }
}