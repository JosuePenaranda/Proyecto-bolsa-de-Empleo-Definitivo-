package Modelo;

public class Oferente {

    private String identificacion;
    private String nombre;
    private String primerApellido;
    private Nacionalidad nacionalidad;
    private int telefono;
    private String correo;
    private String lugar_residencia;
    private String clave;
    private boolean autorizado;
    private String curriculum;

    public Oferente(String identificacion, String nombre, String primerApellido, Nacionalidad nacionalidad, int telefono, String correo, String lugar_residencia, String clave) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.correo = correo;
        this.lugar_residencia = lugar_residencia;
        this.clave = clave;
        this.autorizado = false; // inicia sin autorización
    }

    public Oferente() {
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getprimerApellido() {
        return primerApellido;
    }

    public void setprimerApellido(String apellido) {
        this.primerApellido = apellido;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLugar_residencia() {
        return lugar_residencia;
    }

    public void setLugar_residencia(String lugar_residencia) {
        this.lugar_residencia = lugar_residencia;
    }

    public String getClave() {return clave;}

    public void setClave(String clave) { this.clave = clave;}

    public boolean isAutorizado() { return autorizado; }

    public void setAutorizado(boolean autorizado) { this.autorizado = autorizado; }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    @Override
    public String toString() {
        return "Model.Oferente{" +
                "identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", nacionalidad='" + nacionalidad.getNombre() + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                ", lugarResidencia='" + lugar_residencia + '\'' +
                ", autorizado=" + autorizado +
                '}';
    }
}

