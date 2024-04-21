package D.ex1.program;

import D.ex1.clase.Credit;
import D.ex1.clase.CreditFactory;
import D.ex1.clase.CreditIpotecarFactory;
import D.ex1.clase.CreditPersonalFactory;

public class Main {
    public static void main(String[] args){
        CreditFactory factory = new CreditPersonalFactory();
        Credit credit = factory.creazaCredit();
        credit.descriere();

        factory = new CreditIpotecarFactory();
        credit = factory.creazaCredit();
        credit.descriere();
    }
}
