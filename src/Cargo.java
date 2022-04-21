public class Cargo extends SpaceShip{

    private int cargaMaxima;
    private int cargaActual = 0;
    private int contenedoresParaCargar;

    public Cargo(String nombre, String matriculaGalactica, int aceleracion, int ejeMovimiento, int cargaMaxima) {
        super(nombre, matriculaGalactica, aceleracion, ejeMovimiento);
        this.cargaMaxima = cargaMaxima;
    }

    public void load() {
        // Comprobación
        int contenedoresTrasCargar = cargaActual + contenedoresParaCargar;

        if (contenedoresTrasCargar <= cargaMaxima) {
            cargaActual += contenedoresParaCargar;
            System.out.println("Se han cargado " + contenedoresParaCargar + " contenedores, la carga actual es:  " + cargaActual);

        } else if (cargaActual == cargaMaxima){
            System.out.println("ALERTA: La capacidad de carga de la nave está al máximo.");

        } else {
            System.out.println("ERROR: El valor introducido es demasiado grande.");
        }
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
}
