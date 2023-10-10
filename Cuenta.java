public class Cuenta {
    public static void main(String[] args) {
        Persona cliente1 = new Persona("Juan", "12345678", 'C');
        cliente1.depositar(200);
        cliente1.retirar(100);
        System.out.println(cliente1.toString());
    }
}


