package D.ex7.program;

import D.ex7.clase.Facade;

public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        boolean poateDeschide = facade.poateDeschideCont("Ion Popescu", "1990102399999");
        if (poateDeschide) {
            System.out.println("Contul poate fi deschis.");
        } else {
            System.out.println("Contul nu poate fi deschis.");
        }
    }
}
