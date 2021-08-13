package domain;

public class Circulo extends Figura {
    private float radio;

    public float superficie(){
        return (float)Math.PI * radio * radio;
    }

    public float perimetro(){
        return 2 * (float)Math.PI * radio;
    }

    public Circulo(String nombre, float radio) {
        super(nombre);
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
}
