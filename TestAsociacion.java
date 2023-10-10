public class TestAsociacion {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.agregarCliente(new Cliente("Cliente 1", 'C'));
        banco.agregarCliente(new Cliente("Cliente 2", 'B'));
        banco.agregarCliente(new Cliente("Cliente 3", 'C'));
        banco.agregarCliente(new Cliente("Cliente 4", 'E'));

        System.out.println("Todos los clientes:");
        for (Cliente cliente : banco.clienteTipo('C')) {
            System.out.println(cliente.toString());
        }

        Cliente clienteEliminado = banco.darBajaCliente("Cliente 2");
        if (clienteEliminado != null) {
            System.out.println("\nCliente dado de baja: " + clienteEliminado.toString());
        } else {
            System.out.println("\nCliente no encontrado.");
        }

        System.out.println("\nClientes de tipo 'B':");
        for (Cliente cliente : banco.clienteTipo('B')) {
            System.out.println(cliente.toString());
        }
    }
}