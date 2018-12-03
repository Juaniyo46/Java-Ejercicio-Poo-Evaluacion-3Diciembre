package es.JuanAntonio;

public class Main {

    public static void main(String[] args) {

        Casas casa1 = new Casas("Calle Lonja 3, Linares, Jaén", 23700,3,90);
        Casas casa2 = new Casas("Calle Bailen 6, Mengibar, Jaén", 23620, 5, 190);
        Casas casa3 = new Casas("Calle Los Grillares 8, Mengibar, Jaén", 23620,2,200);

        String listAddress = casa1.getAddress()+"\n" + casa2.getAddress()+"\n" + casa3.getAddress();

        String listPostalCode = casa1.getPostalCode() + "\n" + casa2.getPostalCode() + "\n" + casa3.getPostalCode();

        String listPopulation = casa1.getPopulation() + "\n" + casa2.getPopulation() + "\n" + casa3.getPopulation();

        String listSquareMeter = casa1.getSquareMeter() + "\n" + casa2.getSquareMeter() + "\n" + casa3.getSquareMeter();

        System.out.println(listAddress);
        System.out.println(listPostalCode);
        System.out.println(listPopulation);
        System.out.println(listSquareMeter);

    }


}
