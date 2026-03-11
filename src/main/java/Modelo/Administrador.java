package Modelo;

public class Administrador {

    private String identificacion;
    private String correo;
    private String clave;

    public Administrador(String identificacion, String correo, String clave) {
        this.identificacion = identificacion;
        this.correo = correo;
        this.clave = clave;
    }

    public Administrador() {}

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}