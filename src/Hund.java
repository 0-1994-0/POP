import java.util.Scanner;

public class Hund {
    String name;
    String rasse;
    int alter;
    String farbe;



    public void bellen (){
        System.out.println("wuff");

    }
    public void gibMirInfo (){
        System.out.println("Der Hund " + name);
    }

    public boolean kannStoekBringen (){
        System.out.println("Bitte Y oder N eingeben: ");
        Scanner input = new Scanner(System.in);

        if (input.next().equals("Y")){
            return true;
        } else {
            return false;
        }
    }

}
