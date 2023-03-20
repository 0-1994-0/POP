import java.util.Scanner;

public class Polizist {


    public float GeschwMessen (){
        System.out.println("Die Geschwindigkeit ist: ");
        Scanner scanner = new Scanner(System.in);
        float geschwindigkeit = scanner.nextFloat();

        return geschwindigkeit;

    }
}
