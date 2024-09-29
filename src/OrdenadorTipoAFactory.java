package src;
public class OrdenadorTipoAFactory implements OrdenadorFactory {
    @Override
    public RAM crearRAM() {
        return new RAMTipoA();
    }

    @Override
    public DiscoDuro crearDiscoDuro() {
        return new DiscoDuroTipoA();
    }

    @Override
    public Pantalla crearPantalla() {
        return new PantallaTipoA();
    }
}
