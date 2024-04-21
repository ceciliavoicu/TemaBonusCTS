package D.ex3.clase;

public class ContBancarBuilder implements Builder {
    private ContBancar contBancar;

    public ContBancarBuilder() {
        contBancar=new ContBancar(false,true,false);


    }


    @Override
    public ContBancar build() {
        return contBancar;
    }


    public ContBancarBuilder setPrimesteSalariu(boolean primesteSalariu)
    {
        this.contBancar.setPrimesteSalariu(primesteSalariu);
        return this;
    }

    public ContBancarBuilder setAreCard(boolean areCard)
    {
        this.contBancar.setAreCard(areCard);
        return this;
    }
    public ContBancarBuilder setAreInternetBanking(boolean areInternetBanking)
    {
        this.contBancar.setAreInternetBanking(areInternetBanking);
        return this;
    }
}
