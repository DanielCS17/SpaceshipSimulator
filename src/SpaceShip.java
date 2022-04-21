public class SpaceShip {

    private String nombre;
    private String matriculaGalactica;
    private int aceleracion;
    private int velocidadX = 0;
    private int velocidadY = 0;
    private int coordenadaX = 0;
    private int coordenadaY = 0;
    private int direccionX = 0;
    private int direccionY = 0;
    private int ejeMovimiento;


    public SpaceShip(String nombre, String matriculaGalactica, int aceleracion, int ejeMovimiento) {
        this.nombre = nombre;
        this.matriculaGalactica = matriculaGalactica;
        this.aceleracion = aceleracion;
        this.ejeMovimiento = ejeMovimiento;
    }

    public void speedUp() {

        if (ejeMovimiento == 0) {
            velocidadX = velocidadX + aceleracion;
            coordenadaX = coordenadaX + velocidadX;
            System.out.println("Acelerando en el eje X...");
            System.out.println("La velocidad actual es: " + velocidadX + "km/h");
            System.out.println("Las coordenadas actuales son: Y = " + coordenadaY + ", X = " + coordenadaX);

        } else if (ejeMovimiento == 1) {
            velocidadY = velocidadY + aceleracion;
            coordenadaY = coordenadaY + velocidadY;
            System.out.println("Acelerando en el eje Y...");
            System.out.println("La velocidad actual es: " + velocidadY + "km/h");
            System.out.println("Las coordenadas actuales son: X = " + coordenadaX + ", Y = " + coordenadaY);

        } else {
            System.out.println("ERROR: Seleccione el eje X o el eje Y.");
        }
    }

    public void brake() {

        if (ejeMovimiento == 0) {
            velocidadX = velocidadX - aceleracion;
            System.out.println("Acelerando en el eje X...");
            System.out.println("La velocidad actual es: " + velocidadX + "km/h");

        } else if (ejeMovimiento == 1) {
            velocidadY = velocidadY - aceleracion;
            System.out.println("Acelerando en el eje Y...");
            System.out.println("La velocidad actual es: " + velocidadY + "km/h");

        } else {
            System.out.println("ERROR: Seleccione el eje X o el eje Y.");
        }
    }

    public void emergencyStop() {
        System.out.println("ACTIVANDO FRENO DE EMERGENCIA...");
        velocidadX = 0;
        velocidadY = 0;
        System.out.println("La nave se ha frenado correctamente");
        System.out.println("Velocidad X: " + velocidadX + "km/h");
        System.out.println("Velocidad Y: " + velocidadY + "km/h");
        System.out.println("Coordenadas: X = " + coordenadaX + " , Y = " + coordenadaY);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatriculaGalactica() {
        return matriculaGalactica;
    }

    public void setMatriculaGalactica(String matriculaGalactica) {
        this.matriculaGalactica = matriculaGalactica;
    }

    public float getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public float getVelocidadX() {
        return velocidadX;
    }

    public void setVelocidadX(int velocidadX) {
        this.velocidadX = velocidadX;
    }

    public float getVelocidadY() {
        return velocidadY;
    }

    public void setVelocidadY(int velocidadY) {
        this.velocidadY = velocidadY;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int getDireccionX() {
        return direccionX;
    }

    public void setDireccionX(int direccionX) {
        this.direccionX = direccionX;
    }

    public int getDireccionY() {
        return direccionY;
    }

    public void setDireccionY(int direccionY) {
        this.direccionY = direccionY;
    }

    public int getEjeMovimiento() {
        return ejeMovimiento;
    }

    public void setEjeMovimiento(int ejeMovimiento) {
        this.ejeMovimiento = ejeMovimiento;
    }

    @Override
    public String toString() {
        return "                      ___----\\\n" +
                "                     /_,/____.\\               ,...____...____*\n" +
                "         __...--.'``;.;  ;.;  ;`;--..__     .'    ,-,     _.-´\n" +
                "   _..-''-------'   `'   `'`  `'`       ``-''._  ( * )  ,'\n" +
                "<'_________________            O  O  O  O  O  `-._`-` ,'\n" +
                "  `._    O  O  O   ```````````------...___   '-.._'-:'\n" +
                "     ```--.._      ;.;   <<<<<<<<<<<       ````--...__\\-.\n" +
                "             `.--. `-` _______               ____    | = \\>` ` `  ) ) )\n" +
                "               `. `.          ``````...'''_,'`````.  | = /> ` ` `  ) ) )\n" +
                "                 `._`: D.C.S  __________   `. ESP  \\.__./  ` ` ` ) ) )\n" +
                "                    `-*_____/______/___/____`.     \\  \n" +
                "                                `.    \\        `.    \\\n" +
                "                                  `.   `.___*    `.   `.___*\n" +
                "                                    `------'` )))  `------'` )))";


    }
}