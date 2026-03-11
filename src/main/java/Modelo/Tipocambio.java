package Modelo;

public class Tipocambio {

    public double venta;
    public double compra;
    public String moneda;

    public Tipocambio(double venta, double compra, String moneda) {
        this.venta = venta;
        this.compra = compra;
        this.moneda = moneda;
    }

    public double getVenta() {
        return venta;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        this.compra = compra;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
}

