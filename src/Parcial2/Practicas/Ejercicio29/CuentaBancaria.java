package Parcial2.Ejercicio29;
public class CuentaBancaria {
    private String cliente;
    private Double saldo;
    public CuentaBancaria(String cliente, Double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "cliente='" + cliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
