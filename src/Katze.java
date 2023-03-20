import java.util.Scanner;

public class Katze {
    String name;
    String art;
    int alter;
    boolean kannTrick;


    public  void Katze (String n, int a, String r, boolean kt){
        name =n;
        alter = a;
        art = r;
        kannTrick = kt;
    }


    public void knurren() {
        System.out.println("grrrr");

    }



    public Object kannTrickMachen (){
        System.out.println("Kann Trick machen? Y oder N eingeben: ");
        Scanner input = new Scanner(System.in);

        if (kannTrick){
            System.out.println("Trick gelungen");
        } else {
            System.out.println("Trick nicht gelungen");
        }
        
        return null; 

    } 
    
    
}