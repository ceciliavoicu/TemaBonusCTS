package D.ex9.clase;

public class Filiala extends UnitateBancara{
    public Filiala(String nume) {
        super(nume);
    }

    @Override
    public void adauga(UnitateBancara unitateBancara) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sterge(UnitateBancara unitateBancara) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void afiseazaStructura() {
        System.out.println(nume);
    }
}
