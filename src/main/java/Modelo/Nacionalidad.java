package Modelo;

public class Nacionalidad {

    private String iso;
    private String nombre;
    private String descripcion;
    private String iso3;
    private Integer codigoNumero;
    private Integer codigoTelefono;

    public Nacionalidad(String iso, String nombre, String descripcion,
                        String iso3, Integer codigoNumero, Integer codigoTelefono) {
        this.iso = iso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.iso3 = iso3;
        this.codigoNumero = codigoNumero;
        this.codigoTelefono = codigoTelefono;
    }

    public String getIso() {
        return iso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getIso3() {
        return iso3;
    }

    public Integer getCodigoNumero() {
        return codigoNumero;
    }

    public Integer getCodigoTelefono() {
        return codigoTelefono;
    }
}