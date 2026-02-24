/*
 Classe astratta che rappresenta un generico elettrodomestico.
 Contiene attributi e metodi comuni a tutti.
 Non può essere istanziata direttamente.
*/

public abstract class Elettrodomestico {

    protected String nome;
    protected String classeEnergetica;
    protected float consumoGiornaliero; // kWh

    public Elettrodomestico(String nome, String classeEnergetica, float consumoGiornaliero) {
        this.nome = nome;
        this.classeEnergetica = classeEnergetica;
        this.consumoGiornaliero = consumoGiornaliero;
    }

    // Metodo comune: consumo annuale
    public float calcolaConsumoAnnuale() {
        return consumoGiornaliero * 365;
    }

    // Metodo comune: costo annuale (0.30 € per kWh)
    public float calcolaCostoAnnuale() {
        return calcolaConsumoAnnuale() * 0.30f;
    }

    // Metodo astratto: ogni elettrodomestico lo descrive a modo suo
    public abstract String getDescrizione();

    // Getter
    public String getNome() {
        return nome;
    }
}