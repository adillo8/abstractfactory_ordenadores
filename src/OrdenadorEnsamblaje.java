package src;
public class OrdenadorEnsamblaje {
    private RAM ram;
    private DiscoDuro discoDuro;
    private Pantalla pantalla;

    public OrdenadorEnsamblaje(OrdenadorFactory factory) {
        this.ram = factory.crearRAM();
        this.discoDuro = factory.crearDiscoDuro();
        this.pantalla = factory.crearPantalla();
    }

    public void mostrarEspecificaciones() {
        System.out.println("RAM: " + ram.getRAMInfo());
        System.out.println("Disco Duro: " + discoDuro.getDiscoDuroInfo());
        System.out.println("Pantalla: " + pantalla.getPantallaInfo());
    }
}
