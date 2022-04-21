public class Cargo extends SpaceShip{

    private int cargaMaxima;
    private int cargaActual = 0;
    private int contenedoresParaCargar;

    public Cargo(String nombre, String matriculaGalactica, int aceleracion, int ejeMovimiento, int cargaMaxima) {
        super(nombre, matriculaGalactica, aceleracion, ejeMovimiento);
        this.cargaMaxima = cargaMaxima;
    }

    public void load() {
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

    public void unload() {
        int contenedoresRestantes = cargaActual - contenedoresParaCargar;

        if (contenedoresRestantes >= 0) {
            cargaActual -= contenedoresParaCargar;
            System.out.println("Se han descargado " + contenedoresParaCargar + " contenedores de la nave, la carga actual es: " + cargaActual);

        } else if (cargaActual == 0){
            System.out.println("La nave no tiene contenedores en su interior.");
        }
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
}
