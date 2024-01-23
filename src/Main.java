import enums.LampType;
import enums.PaintColor;
import model.*;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("Master Bedroom", new Wall("North"), new Wall("South"),
                new Wall("East"), new Wall("West"),
                new Ceiling(300, PaintColor.BLUE),
                new Bed("Traditional", 4, 75, 3, 2),
                new Lamp(LampType.NEON, false, 4),
                new Wardrobe(150, 220, 80),
                new Carpet(250, 350, PaintColor.RED));

        // Test et
        System.out.println("Bedroom Name: " + bedroom.getName());
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Lamp Battery: " + bedroom.getLamp().isBattery());
        System.out.println("Wardrobe Width: " + bedroom.getWardrobe().getWidth());
        System.out.println("Carpet Color: " + bedroom.getCarpet().getColor());
    }
}