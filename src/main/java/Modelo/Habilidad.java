package Modelo;

public class Habilidad {

    private Integer id;
    private Oferente oferente;
    private Caracteristica caracteristica;
    private int nivel;

    public Habilidad() {}

    public Habilidad(Oferente oferente, Caracteristica caracteristica, int nivel) {
        this.oferente = oferente;
        this.caracteristica = caracteristica;
        this.nivel = nivel;
    }

    public Habilidad(Integer id, Oferente oferente, Caracteristica caracteristica, int nivel) {
        this.id = id;
        this.oferente = oferente;
        this.caracteristica = caracteristica;
        this.nivel = nivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Oferente getOferente() {
        return oferente;
    }

    public void setOferente(Oferente oferente) {
        this.oferente = oferente;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(Caracteristica caracteristica) {
        this.caracteristica = caracteristica;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Model.Habilidad{" +
                "id=" + id +
                ", oferente=" + (oferente != null ? oferente.getNombre() : "null") +
                ", caracteristica=" + (caracteristica != null ? caracteristica.getNombre() : "null") +
                ", nivel=" + nivel +
                '}';
    }
}

