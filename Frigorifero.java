public class Frigorifero extends Elettrodomestico {

    private int litri;

    public Frigorifero(String classeEnergetica, float consumoGiornaliero, int litri) {
        super("Frigorifero", classeEnergetica, consumoGiornaliero);
        this.litri = litri;
    }

    @Override
    public String getDescrizione() {
        return nome + " | " + litri + " L | Classe " + classeEnergetica;
    }
}