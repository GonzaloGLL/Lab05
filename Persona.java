public class Persona {
    private String nombre;
    private String dni;
    private char tipoCliente;
    private String numeroCuenta;
    private double saldo;

    public Persona(String nombre, String dni, char tipoCliente) {
        this.nombre = nombre;
        this.dni = dni;
        setTipoCliente(tipoCliente);
        asignarNumeroCuenta();
        this.saldo = 50.0; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    private void setTipoCliente(char tipoCliente) {
        if (tipoCliente == 'C' || tipoCliente == 'B' || tipoCliente == 'E') {
            this.tipoCliente = tipoCliente;
        } else {
            this.tipoCliente = 'C'; 
        }
    }

    private void asignarNumeroCuenta() {
        int numeroBase = 0;

        switch (tipoCliente) {
            case 'C':
                numeroBase = 1000;
                break;
            case 'B':
                numeroBase = 5000;
                break;
            case 'E':
                numeroBase = 8000;
                break;
        }

        numeroCuenta = tipoCliente + String.valueOf(numeroBase);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo - cantidad >= 50.0) {
            saldo -= cantidad;
        }
    }

  
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDNI: " + dni + "\nTipo de Cliente: " + tipoCliente + "\nNumero de Cuenta: " + numeroCuenta + "\nSaldo: " + saldo;
    }
}

