package Modelo;

public class Puesto {

    private Integer id;
    private String descripcion;
    private double salario;
    private String tipoPublicacion; // PUBLICA o PRIVADA
    private Empresa empresa;
    private boolean activo;
    // requisito
    private Caracteristica caracteristica;
    private int nivelRequerido;

    public Puesto() {}

    public Puesto(String descripcion, double salario, String tipoPublicacion,
                  Empresa empresa, Caracteristica caracteristica, int nivelRequerido) {

        this.descripcion = descripcion;
        this.salario = salario;
        this.tipoPublicacion = tipoPublicacion;
        this.empresa = empresa;
        this.caracteristica = caracteristica;
        this.nivelRequerido = nivelRequerido;
        this.activo = true; // inicia activo
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipoPublicacion() {
        return tipoPublicacion;
    }

    public void setTipoPublicacion(String tipoPublicacion) {
        this.tipoPublicacion = tipoPublicacion;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(Caracteristica caracteristica) {
        this.caracteristica = caracteristica;
    }

    public int getNivelRequerido() {
        return nivelRequerido;
    }

    public void setNivelRequerido(int nivelRequerido) {
        this.nivelRequerido = nivelRequerido;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Model.Puesto{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", salario=" + salario +
                ", tipoPublicacion='" + tipoPublicacion + '\'' +
                ", empresa=" + (empresa != null ? empresa.getNombre() : "null") +
                ", caracteristica=" + (caracteristica != null ? caracteristica.getNombre() : "null") +
                ", nivelRequerido=" + nivelRequerido +
                ", activo=" + activo +
                '}';
    }
}
