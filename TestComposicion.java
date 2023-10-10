public class TestComposicion {
    public static void main(String[] args) {
        
        Persona cliente1 = new Persona("Juan", "12345678", 'C');
        Persona cliente2 = new Persona("Ana", "87654321", 'B');
        Persona cliente3 = new Persona("Pedro", "55555555", 'E');

        
        System.out.println("Informacion de las personas:");
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(cliente3.toString());

        
        cliente1.depositar(200);
        cliente2.depositar(500);
        cliente3.depositar(1000);
        cliente1.retirar(50);
        cliente2.retirar(200);
        cliente3.retirar(300);

        
        System.out.println("\nInformacion actualizada de las personas:");
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(cliente3.toString());
    }
}
