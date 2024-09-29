package src;
public class OrdenadorTipoCFactory implements OrdenadorFactory {
    @Override
    public RAM crearRAM() {
        return new RAMTipoC();
    }

    @Override
    public DiscoDuro crearDiscoDuro() {
        return new DiscoDuroTipoC();
    }

    @Override
    public Pantalla crearPantalla() {
        return new PantallaTipoC();
    }
}
