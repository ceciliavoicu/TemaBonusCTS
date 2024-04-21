package D.ex3.clase;

public class ContBancar {
    private  boolean primesteSalariu;
    private boolean areCard;
    private boolean areInternetBanking;

    public ContBancar(boolean primesteSalariu, boolean areCard, boolean areInternetBanking) {
        this.primesteSalariu = primesteSalariu;
        this.areCard = areCard;
        this.areInternetBanking = areInternetBanking;
    }

    public boolean isPrimesteSalariu() {
        return primesteSalariu;
    }

    public void setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
    }

    public boolean isAreCard() {
        return areCard;
    }

    public void setAreCard(boolean areCard) {
        this.areCard = areCard;
    }

    public boolean isAreInternetBanking() {
        return areInternetBanking;
    }

    public void setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "primesteSalariu=" + primesteSalariu +
                ", areCard=" + areCard +
                ", areInternetBanking=" + areInternetBanking +
                '}';
    }
}
