public class BatallaEspacial {
    public static void main(String[] args)throws InterruptedException {

        Contador contador = new Contador();

        NaveEstelar batalla1 = new NaveEstelar(contador, "ZORG");
        NaveEstelar batalla2 = new NaveEstelar(contador, "BLIP");


        Thread h1 = new Thread(batalla1);
        Thread h2 = new Thread(batalla2);


        h1.start();
        h2.start();

        h1.join();
        h2.join();

        if(batalla1.getMetrosTotales() > batalla2.getMetrosTotales()){
            System.out.println("Está batalla la ha ganado: " + batalla1.getNombre());
        } else {
            System.out.println("Está batalla la ha ganado: " + batalla2.getNombre());
            }
        }
    }
