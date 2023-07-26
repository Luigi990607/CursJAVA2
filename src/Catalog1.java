import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Elev {
    private String nume;
    private int nota;

    public Elev(String nume, int nota) {
        this.nume = nume;
        this.nota = nota;
    }

    public String getNume() {
        return nume;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}

public class Catalog1 {

    public static void main(String[] args) {
        List<Elev> catalog = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Introdu numele elevului (sau 'exit' pentru a ieși din program): ");
            String nume = scanner.nextLine();

            if (nume.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Introdu nota elevului: ");
            int nota = Integer.parseInt(scanner.nextLine());

            Elev elev = findElev(catalog, nume);

            if (elev == null) {
                catalog.add(new Elev(nume, nota));
                System.out.println("Nu aveai nota, ti-am trecut acum!");
            } else {
                if (nota > elev.getNota()) {
                    elev.setNota(nota);
                } else {
                    System.out.println("Nu ai nevoie de alta nota");
                }
            }
        }

        System.out.println("Catalogul elevilor:");
        for (Elev elev : catalog) {
            System.out.println(elev.getNume() + ": " + elev.getNota());
        }
    }

    private static Elev findElev(List<Elev> catalog, String nume) {
        for (Elev elev : catalog) {
            if (elev.getNume().equals(nume)) {
                return elev;
            }
        }
        return null;
    }
}