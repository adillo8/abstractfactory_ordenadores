package src;    
public class OrdenadorTipoBFactory implements OrdenadorFactory {
    @Override
    public RAM crearRAM() {
        return new RAMTipoB();
    }

    @Override
    public DiscoDuro crearDiscoDuro() {
        return new DiscoDuroTipoB();
    }

    @Override
    public Pantalla crearPantalla() {
        return new PantallaTipoB();
    }
}
