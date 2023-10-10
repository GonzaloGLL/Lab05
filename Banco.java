import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nombre;
    private char tipoCliente;

    public Cliente(String nombre, char tipoCliente) {
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Tipo de Cliente: " + tipoCliente;
    }
}

public class Banco {
    private List<Cliente> clientes;

    public Banco() {
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente darBajaCliente(String nombre) {
        for (int i = clientes.size() - 1; i >= 0; i--) {
            Cliente cliente = clientes.get(i);
            if (cliente.getNombre().equals(nombre)) {
                return clientes.remove(i);
            }
        }
        return null; 
    }

    public List<Cliente> clienteTipo(char tipo) {
        List<Cliente> clientesTipo = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getTipoCliente() == tipo) {
                clientesTipo.add(cliente);
            }
        }
        return clientesTipo;
    }
}