public class Cargo extends SpaceShip{

    private int cargaMaxima;

    public Cargo(String nombre, String matriculaGalactica, int aceleracion, int ejeMovimiento, int cargaMaxima) {
        super(nombre, matriculaGalactica, aceleracion, ejeMovimiento);
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
}
