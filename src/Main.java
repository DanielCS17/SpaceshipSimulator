
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        int eje = 2;
        int Ncontenerdores = 0;
        int tipoNave = 2;
        SpaceShip nave = new SpaceShip("", "", 0, 0);
        Cargo cargo = new Cargo("", "", 0, 0, 0);

        while (salir == false) {
            System.out.println("");
            System.out.println("<<<<<<<<<<<<<< MENÚ ESPACIAL >>>>>>>>>>>>>");
            System.out.println("1.- Asignar nombre, matrícula y aceleración a la nave");
            System.out.println("2.- Ver la nave");
            System.out.println("3.- Acelerar");
            System.out.println("4.- Frenar");
            System.out.println("5.- Ejecutar Emergency Stop");
            System.out.println("6.- Cargar la nave Cargo");
            System.out.println("7.- Descargar la nave Cargo");
            System.out.println("0.- Salir del menú y finalizar programa");
            System.out.println("==========================================");
            System.out.print("Indica el número de la operación a realizar: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("");

            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.print("Indica el tipo de nave: 0 = estándar 1 = cargo : ");
                    tipoNave = sc.nextInt();
                    sc.nextLine();

                    if (tipoNave == 0) {
                        System.out.print("Introduce el nombre de la nave: ");
                        String nombre = sc.nextLine();

                        System.out.print("Añade una matrícula para la nave: ");
                        String matricula = sc.nextLine();

                        System.out.print("Indica la aceleración que se aplicará a la nave: ");
                        int aceleracion = sc.nextInt();
                        sc.nextLine();

                        nave.setNombre(nombre);
                        nave.setMatriculaGalactica(matricula);
                        nave.setAceleracion(aceleracion);

                    } else if (tipoNave == 1) {
                        System.out.print("Introduce el nombre de la nave: ");
                        String nombre = sc.nextLine();

                        System.out.print("Añade una matrícula para la nave: ");
                        String matricula = sc.nextLine();

                        System.out.print("Indica la aceleración que se aplicará a la nave: ");
                        int aceleracion = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Indica la capacidad máxima de la nave: ");
                        int cargaMax = sc.nextInt();
                        sc.nextLine();

                        cargo.setNombre(nombre);
                        cargo.setMatriculaGalactica(matricula);
                        cargo.setAceleracion(aceleracion);
                        cargo.setCargaMaxima(cargaMax);

                    } else {
                        System.out.println("ERROR: Opción inválida");
                    }
                    break;

                case 2:
                    if (tipoNave == 1 || tipoNave == 0) {
                        System.out.print(nave);
                    } else {
                        System.out.println("Aún no has creado ninguna nave");
                    }
                    break;

                case 3:
                    if (tipoNave == 0 || tipoNave == 1) {
                        System.out.print("Selecciona un eje:  X: 0, Y: 1 ");
                        eje = sc.nextInt();
                        sc.nextLine();
                        nave.setEjeMovimiento(eje);
                        nave.speedUp();
                    } else {
                        System.out.println("Aún no has creado ninguna nave");
                    }
                    break;

                case 0:
                    salir = true;
                    System.out.println("Cerrando menú...");
                    break;

                default:
                    System.out.println("ERROR: Debes seleccionar una opción del menú");

                }
            }
    }
}
