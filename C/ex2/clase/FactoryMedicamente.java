package C.ex2.clase;

public  abstract class FactoryMedicamente {
    private String denumire;
    private float pret;

    public FactoryMedicamente(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }


    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public  abstract Medicament creareMedicament();
}
