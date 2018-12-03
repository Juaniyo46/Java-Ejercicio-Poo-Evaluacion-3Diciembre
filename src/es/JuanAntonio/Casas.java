package es.JuanAntonio;

public class Casas {
    protected String address;
    protected int postalCode;
    protected int population;
    protected int squareMeter;

    public Casas(String address, int postalCode, int population, int squareMeter) {
        this.address = address;
        this.postalCode = postalCode;
        this.population = population;
        this.squareMeter = squareMeter;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }

    @Override
    public String toString() {
        return "Casas{" +
                "address='" + address + '\'' +
                ", postalCode=" + postalCode +
                ", population=" + population +
                ", squareMeter=" + squareMeter +
                '}';
    }


}
