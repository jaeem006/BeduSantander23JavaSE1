public class Ejemplo2 {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Ford", "Shelby",1965,25000);
        Automovil auto2 = new Automovil("Bugatti", "Veyron", 2009,10000);

        System.out.println("Ford".hashCode());
        System.out.println("Shelby".hashCode());

        System.out.println(auto.hashCode());

    }
}
