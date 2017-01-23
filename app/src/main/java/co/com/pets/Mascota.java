package co.com.pets;

/**
 * Created by xander on 22/01/2017.
 */


public class Mascota {

    private String nombre;
    private int ranking;
    private int foto;

    public Mascota(int foto, String nombre, int ranking) {
        this.foto = foto;
        this.nombre = nombre;
        this.ranking = ranking;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}
