public class Main {
    public static void main(String[] args) {
        //Erstellen des Objektes hundi
//        Hund hundi = new Hund();
//
//        hundi.name = "Coco";
//        hundi.rasse = "York";
//        hundi.alter = 2;
//        hundi.farbe= "silber";
//        hundi.bellen();
//        //hundi.kannStoekBringen();
//        System.out.println("Kann Coco den Stoeck bringen? " + hundi.kannStoekBringen());
//
//
//        System.out.println(hundi.name + " ist "+ hundi.alter + " Jahre alt und als "+ hundi.rasse + " kann so bellen ");
//
//
//        //Erstellen des Objektes Katzi
//        Katze katzi = new Katze();
//        System.out.println();
//
//        katzi.name = "schnurli";
//        System.out.println(katzi.name);
//
//        katzi.name = "Felix";
//        katzi.art = "Straßen Katze";
//        katzi.alter = 3;
//
//        System.out.println(katzi.kannTrickMachen());
//
//        katzi.knurren();
//
//        System.out.println(katzi.name + " ist " + katzi.alter +" und kann" );


        Polizist polizei = new Polizist();
        float geschwindigkeit = polizei.GeschwMessen();


     polizei.GeschwMessen();

        Justiz justiz = new Justiz();

        justiz.Strafe(geschwindigkeit);

    }
}
