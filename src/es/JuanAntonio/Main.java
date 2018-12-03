package es.JuanAntonio;

public class Main {

    static Lista casa;

    public static void main(String[] args) {

       casa = new Lista();
       casa.listas.add(new Casas("Calle Lonja 3, Linares, Jaén", 23700,3,80));
       casa.listas.add(new Casas("Calle  Bailen 5, Mengíbar,Jaén",23620,6,95));
       casa.listas.add(new Casas("Calle Los Grillares 8, Mengíbar, Jaén", 23620,2,200));


            int i = 0;
        System.out.println("Lista de Direcciones");
            for (Casas casa: casa.listas) {
                System.out.println(casa.address);
                i++;
            }
        System.out.println("Lista de Codigos Postal");
            for (Casas casa: casa.listas) {
                System.out.println(casa.postalCode);
                 i++;
            }
        System.out.println("Lista de Nº de habitantes");
            for (Casas casa: casa.listas) {
                System.out.println(casa.population);
                 i++;
            }
        System.out.println("Lista de Metros cuadrados");
            for (Casas casa: casa.listas) {
                System.out.println(casa.squareMeter);
                i++;
            }



    }






    }



