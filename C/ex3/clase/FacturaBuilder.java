package C.ex3.clase;

public class FacturaBuilder implements Builder{

    private Factura factura;

    public FacturaBuilder() {
        factura=new Factura(10,false,false,11);
    }

    @Override
    public Factura build() {
        return factura;
    }

    public FacturaBuilder setNrPagini(int nrPagini)
    {
        this.factura.setNrPagini(nrPagini);
        return  this;
    }

    public FacturaBuilder setPlataCuCard(boolean plataCuCardul)
    {
        this.factura.setPlataCuCard(plataCuCardul);
        return  this;
    }

    public FacturaBuilder setCardFidelitate(boolean cardFidelitate)
    {
        this.factura.setCardFidelitate(cardFidelitate);
        return this;
    }
    public FacturaBuilder setCotaTVA(double cotaTVA)
    {
        this.factura.setCotaTVA(cotaTVA);
        return this;
    }

}
