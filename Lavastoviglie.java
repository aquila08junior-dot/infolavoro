public class Lavastoviglie extends Elettrodomestico {

    private int coperti;

    public Lavastoviglie(String classeEnergetica, float consumoGiornaliero, int coperti) {
        super("Lavastoviglie", classeEnergetica, consumoGiornaliero);
        this.coperti = coperti;
    }

    @Override
    public String getDescrizione() {
        return nome + " | " + coperti + " coperti | Classe " + classeEnergetica;
    }
}