public class Caja {
    private int ancho;
    private int alto;
    private int profundo;

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public int getProfundo() {
        return profundo;
    }

    public Caja() {
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int volumen(){
        return ancho*alto*profundo;
    }
}
