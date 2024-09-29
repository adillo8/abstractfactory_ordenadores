package src;
public interface OrdenadorFactory {
    RAM crearRAM();
    DiscoDuro crearDiscoDuro();
    Pantalla crearPantalla();
}
