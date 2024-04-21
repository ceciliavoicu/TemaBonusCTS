package C.ex4.clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements IReteta{
    private String nume;
    private List<String> lista;

    public Reteta() {
    }

    @Override
    public Reteta copiaza() {
        Reteta reteta=new Reteta();
        reteta.nume= this.nume;
        reteta.lista=new ArrayList<>();
        reteta.lista.addAll(this.lista);
        return reteta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    public Reteta(String nume, List<String> lista) {
        this.nume = nume;
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nume='" + nume + '\'' +
                ", lista=" + lista +
                '}';
    }
}
