public class Automovil {
    private String placa;
    private int numeroPuertas;
    private String marca;
    private String modelo;
    private Motor motor; 

    public Automovil(String placa, int numeroPuertas, String marca, String modelo) {
        this.placa = placa;
        this.numeroPuertas = numeroPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = null; 
    }

    public Automovil(String placa, int numeroPuertas, String marca, String modelo, Motor motor) {
        this.placa = placa;
        this.numeroPuertas = numeroPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        if (motor != null) {
            return "placa : " + placa + "\nNro Puertas: " + numeroPuertas + "\nMarca: " + marca + "\nModelo : " + modelo + "\n" + motor.toString();
        } else {
            return "placa : " + placa + "\nNro Puertas: " + numeroPuertas + "\nMarca: " + marca + "\nModelo : " + modelo;
        }
    }
}