package composition;

public class Main {
    public static void main(String[] args) {
        Dimensions pcDimensions = new Dimensions(20, 20, 5);
        Case pcCase = new Case("220B", "Dell", "240", pcDimensions);
        Monitor pcMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard pcMotherboard = new Motherboard("BJ-200", "Asus", "v2.44", 6, 2);
        PC pc = new PC(pcCase, pcMonitor, pcMotherboard);

        pc.getMonitor().drawPixelAt(200, 500, "red"); // Invoke method via Getter
        pc.getMotherboard().loadProgram("Windows 10"); // Invoke method via Getter
        pc.getPcCase().pressPowerButton(); // Invoke method via Getter
    }
}