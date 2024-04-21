package D.ex3.program;

import D.ex3.clase.ContBancar;
import D.ex3.clase.ContBancarBuilder;

public class Main {
    public static void main(String[] args) {

        ContBancar bancar=new ContBancarBuilder().setPrimesteSalariu(false).setAreCard(true).setAreInternetBanking(true).build();

        ContBancar bancar1=new ContBancarBuilder().setAreCard(false).setPrimesteSalariu(false).setAreInternetBanking(true).build();
        System.out.println(bancar);
        System.out.println(bancar1);
    }
}
