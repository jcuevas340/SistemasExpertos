package juegoAdivinaQuienTerminal;

public class Personaje {
    private String nombre;
    private String sexo;
    private String lentes;
    private String bigote;
    private String gorra;
    private String color_ojos;
    private String tipo_cabello;
    private String color_cabello;

    public Personaje(String nombre, String sexo, String lentes, String bigote, String gorra, String color_ojos, String tipo_cabello, String color_cabello) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.lentes = lentes;
        this.bigote = bigote;
        this.gorra = gorra;
        this.color_ojos = color_ojos;
        this.tipo_cabello = tipo_cabello;
        this.color_cabello = color_cabello;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLentes() {
        return lentes;
    }

    public void setLentes(String lentes) {
        this.lentes = lentes;
    }

    public String getBigote() {
        return bigote;
    }

    public void setBigote(String bigote) {
        this.bigote = bigote;
    }

    public String getGorra() {
        return gorra;
    }

    public void setGorra(String gorra) {
        this.gorra = gorra;
    }

    public String getColor_ojos() {
        return color_ojos;
    }

    public void setColor_ojos(String color_ojos) {
        this.color_ojos = color_ojos;
    }

    public String getTipo_cabello() {
        return tipo_cabello;
    }

    public void setTipo_cabello(String tipo_cabello) {
        this.tipo_cabello = tipo_cabello;
    }

    public String getColor_cabello() {
        return color_cabello;
    }

    public void setColor_cabello(String color_cabello) {
        this.color_cabello = color_cabello;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", lentes='" + lentes + '\'' +
                ", bigote='" + bigote + '\'' +
                ", gorra='" + gorra + '\'' +
                ", color_ojos='" + color_ojos + '\'' +
                ", tipo_cabello='" + tipo_cabello + '\'' +
                ", color_cabello='" + color_cabello + '\'' +
                '}';
    }
}
