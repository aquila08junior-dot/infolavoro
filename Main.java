import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Classe principale.
 Utilizza una lista di tipo Elettrodomestico.
 Grazie al polimorfismo può contenere oggetti di qualsiasi sottoclasse.
*/

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Elettrodomestico> lista = new ArrayList<>();

        int scelta;

        do {
            System.out.println("\n1 - Aggiungi elettrodomestico");
            System.out.println("2 - Mostra elenco");
            System.out.println("3 - Mostra più energivoro");
            System.out.println("0 - Esci");
            System.out.print("Scelta: ");

            scelta = sc.nextInt();
            sc.nextLine();

            switch (scelta) {

                case 1:
                    System.out.println("1 Lavatrice | 2 Frigorifero | 3 Lavastoviglie | 4 Asciugatrice");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Classe energetica: ");
                    String classe = sc.nextLine();

                    System.out.print("Consumo giornaliero (kWh): ");
                    float consumo = sc.nextFloat();

                    Elettrodomestico e = null;

                    switch (tipo) {

                        case 1:
                            System.out.print("Capacità kg: ");
                            int kg = sc.nextInt();
                            e = new Lavatrice(classe, consumo, kg);
                            break;

                        case 2:
                            System.out.print("Capacità litri: ");
                            int litri = sc.nextInt();
                            e = new Frigorifero(classe, consumo, litri);
                            break;

                        case 3:
                            System.out.print("Numero coperti: ");
                            int coperti = sc.nextInt();
                            e = new Lavastoviglie(classe, consumo, coperti);
                            break;

                        case 4:
                            System.out.print("Capacità kg: ");
                            int kgAsci = sc.nextInt();
                            e = new Asciugatrice(classe, consumo, kgAsci);
                            break;
                    }

                    if (e != null) {
                        lista.add(e);
                        System.out.println("Aggiunto correttamente.");
                    }

                    break;

                case 2:
                    for (Elettrodomestico el : lista) {
                        System.out.println(el.getDescrizione());
                        System.out.println("Consumo annuo: " + el.calcolaConsumoAnnuale() + " kWh");
                        System.out.println("Costo annuo stimato: " + el.calcolaCostoAnnuale() + " €");
                    }
                    break;

                case 3:
                    Elettrodomestico max = null;

                    for (Elettrodomestico el : lista) {
                        if (max == null || el.calcolaConsumoAnnuale() > max.calcolaConsumoAnnuale()) {
                            max = el;
                        }
                    }

                    if (max != null) {
                        System.out.println("Il più energivoro è:");
                        System.out.println(max.getDescrizione());
                    }
                    break;
            }

        } while (scelta != 0);
    }
}
