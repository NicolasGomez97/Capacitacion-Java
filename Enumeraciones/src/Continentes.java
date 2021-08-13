import java.util.PrimitiveIterator;

public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERIA(34),
    OCEANIA(14);

    private final int paises;

    Continentes(int paises){
        this.paises=paises;
    }

    public int getPaises() {
        return paises;
    }
}
