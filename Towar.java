package net.radek;

public class Towar {

    private int sku;
    private String typ;
    private double cena;
    private int maxIlość;

    public Towar(int sku, String typ, double cena, int maxIlość) {
        this.sku = sku;
        this.typ = typ;
        this.cena = cena;
        this.maxIlość = maxIlość;
    }

    public int getSku() {
        return sku;
    }

    public int getMaxIlość() {
        return maxIlość;
    }

    public void setMaxIlość(int maxIlość) {
        this.maxIlość = maxIlość;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override

    public String toString() {

        return "Poproszę produkt " +

                 typ  +



                ", za " + cena ;

    }

}

