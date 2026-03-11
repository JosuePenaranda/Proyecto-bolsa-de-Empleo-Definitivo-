package Modelo;

public class Caracteristica {

    private Integer id;
    private String nombre;
    private Caracteristica padre;

    // Constructor vacío
    public Caracteristica() {}

    // Constructor para crear una nueva característica
    public Caracteristica(String nombre) {
        this.nombre = nombre;
    }

    // Constructor cuando se carga desde la base de datos
    public Caracteristica(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Constructor completo
    public Caracteristica(Integer id, String nombre, Caracteristica padre) {
        this.id = id;
        this.nombre = nombre;
        this.padre = padre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Caracteristica getPadre() {
        return padre;
    }

    public void setPadre(Caracteristica padre) {
        this.padre = padre;
    }

    @Override
    public String toString() {
        return "Model.Caracteristica{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", padre=" + (padre != null ? padre.getNombre() : "null") +
                '}';
    }
}
