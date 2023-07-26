package curs10.homework;

public class Elev {

	public String nume;
    public int nota;

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

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}