package Ejercicios;

class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

     //Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "12345";
        this.saldo = 0;
        this.tipoCuenta = "Ahorros";
    }

     // Constructor parametrizado
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }
     // Constructor sobrecargado
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }  
    public String toString() {
        return "Cuenta: " + numeroCuenta + ", Saldo: " + saldo + ", Tipo: " + tipoCuenta;
    }
}