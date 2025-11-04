public class NaveEstelar implements Runnable {

    private Contador count;
    private String nombre;
    private int metrosTotales = 0;

    public NaveEstelar(Contador contador, String nombre){
        this.count  = contador;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMetrosTotales() {
        return metrosTotales;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 200; i++) {
            count.incrementar();
            metrosTotales += count.getCuenta();

            System.out.println("Nave " + nombre + ":" + " Tirada " + i + " - He avanzado " + metrosTotales + " metros!");

        }

        System.out.println("Nave " + nombre + ":" + " Batalla espacial concluida.");
    }
}
