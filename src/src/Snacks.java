package src;

import java.util.ArrayList;
import java.util.List;

public class Snacks {

    private static final List<Snack> snacks;

    //Bloque static inicializador
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papitas", 20.00));
        snacks.add(new Snack("Refresco", 20.00));
        snacks.add(new Snack("Sandwich", 30.00));
    }

    public static void agregarSnack(Snack snack) {
        snacks.add(snack);
    }

    public static void mostrarSnacks() {
        var inventarioSnacks = "";
        for (Snack snack : snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("---Snacks en el inventario---");
        System.out.println(inventarioSnacks);

    }
    
    public static List<Snack> getSnacks(){
        return Snacks.snacks;
    }
    
}
