package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //el usuario elige que ordenador quiere
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona el tipo de ordenador (A, B, C):");
        String tipo = scanner.nextLine().toUpperCase();

        OrdenadorFactory factory;

        switch (tipo) {
            case "A":
                factory = new OrdenadorTipoAFactory();
                break;
            case "B":
                factory = new OrdenadorTipoBFactory();
                break;
            case "C":
                factory = new OrdenadorTipoCFactory();
                break;
            default:
                throw new IllegalArgumentException("Tipo de ordenador no válido");
        }

        OrdenadorEnsamblaje ordenador = new OrdenadorEnsamblaje(factory);
        System.out.println("Especificaciones del Ordenador Tipo " + tipo + "que has creado :");
        ordenador.mostrarEspecificaciones();
    }
}

