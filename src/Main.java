import java.time.OffsetDateTime;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//verificare che la prima data è precedente alla seconda
//verificare che la seconda data è successiva alla prima
//verificare che le due date sono uguali ad ora
//Stampa il risultato.
public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime date2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean isBefore = date.isBefore(date2);
        System.out.println("La prima data è precedente alla seconda: " + isBefore);

        boolean isAfter = date2.isAfter(date);
        System.out.println("La seconda data è successiva alla prima: " + isAfter);

        boolean isEqual = date.isEqual(date2);
        System.out.println("Le due date sono uguali: " + isEqual);
    }
}