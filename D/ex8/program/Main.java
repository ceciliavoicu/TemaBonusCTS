package D.ex8.program;

import D.ex8.clase.ICredit;
import D.ex8.clase.Proxy;

public class Main {
    public static void main(String[] args) {
        try {
            ICredit icredit = new Proxy("RON", 5000);
            icredit.acordaCredit(5000);

            ICredit icredit2 = new Proxy("USD", 1000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
