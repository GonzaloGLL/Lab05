public class Main {
    public static void main(String[] args) {
    
        Automovil auto1 = new Automovil("AU398", 3, "Toyota", "Corolla");

        Motor motor1 = new Motor(1000);
        Automovil auto2 = new Automovil("VH742", 5, "Nissan", "Versa", motor1);

        System.out.println("Automovil sin motor:\n" + auto1.toString() + "\n");
        System.out.println("Automovil con motor:\n" + auto2.toString());
    }
}