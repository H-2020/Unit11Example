package enumerations2;

public class PlanetApp {
    public static void main(String[] args) {

        Planet[] solarSystem = Planet.values();

        for (Planet p:solarSystem) {
            System.out.println(p);
        }
    }
}
