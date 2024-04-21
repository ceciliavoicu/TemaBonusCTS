package C.ex3.clase;

public class Factura {
    private int nrPagini;
    private boolean plataCuCard;
    private boolean cardFidelitate;
    private double cotaTVA;

    public Factura(int nrPagini, boolean plataCuCard, boolean cardFidelitate, double cotaTVA) {
        this.nrPagini = nrPagini;
        this.plataCuCard = plataCuCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public boolean isPlataCuCard() {
        return plataCuCard;
    }

    public void setPlataCuCard(boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
    }

    public boolean isCardFidelitate() {
        return cardFidelitate;
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public double getCotaTVA() {
        return cotaTVA;
    }

    public void setCotaTVA(double cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "nrPagini=" + nrPagini +
                ", plataCuCard=" + plataCuCard +
                ", cardFidelitate=" + cardFidelitate +
                ", cotaTVA=" + cotaTVA +
                '}';
    }
}
