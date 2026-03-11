package Modelo;

public class Empresa {

    private Integer id;
    private String nombre;
    private String localizacion;
    private String correo;
    private String telefono;
    private String descripcion;
    private String clave;
    private boolean autorizado;

    public Empresa() {}

    // Constructor para crear empresa nueva
    public Empresa(String nombre, String correo, String localizacion, String telefono, String descripcion, String clave) {
        this.nombre = nombre;
        this.correo = correo;
        this.localizacion = localizacion;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.clave = clave;
        this.autorizado = false; // por defecto no está autorizada
    }

    // Constructor cuando viene de la base de datos
    public Empresa(Integer id, String nombre, String correo, String localizacion, String telefono, String descripcion, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.localizacion = localizacion;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.clave = clave;
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

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }


    @Override
    public String toString() {
        return "Model.Empresa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", autorizado=" + autorizado +
                '}';
    }
}
