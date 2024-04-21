package D.ex7.clase;

public class Facade {
    private VerificareVarsta verificareVarsta=new VerificareVarsta();
    private Politie politie=new Politie();
    private BirouCredit birouCredit=new BirouCredit();

    public boolean poateDeschideCont(String nume, String CNP) {
        if (!verificareVarsta.esteMajor(CNP)) {
            System.out.println("Persoana nu este majora.");
            return false;
        }
        if (politie.esteUrmarit(nume)) {
            System.out.println("Persoana este urmarita de politie.");
            return false;
        }
        if (birouCredit.areDatorii(CNP)) {
            System.out.println("Persoana are datorii la alte banci.");
            return false;
        }
        return true;
    }
}
