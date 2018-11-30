import java.awt.Color;

public class PinaCollada {
    // deklariere alle "wichtigen" Konstanten hier
        public static int breite = 400;
        public static int hoehe = 700;
        public static Spielmenue spielmenue;
        public static Charakterkasten[] charakterkaesten = new Charakterkasten[4];
        public static Spieler spielerAktuell;
        // public static Spieler spielerAktuell;

    public static void main (String[] args){
        StdDraw.setCanvasSize(breite, hoehe);
        StdDraw.setXscale(0, breite);
        StdDraw.setYscale(0, hoehe);

        init();
        update();
    }
    public static void init(){
        // Initialisiere (gib einein Wert zu...) den wichtigen Objekten
            // Spielmenue
                spielmenue = new Spielmenue(160,breite, new Color(10, 10, 10));
            // Charakterauswahldinger
                int kasten = 30;
                int lucke = (int) ((160-(4*kasten))/3);
                charakterkaesten[0] = new Charakterkasten(
                    "Ananas",
                    (double)(kasten+lucke),
                    (double)(3*kasten+2*lucke),
                    "img/ananas_normal.png"
                );
                charakterkaesten[1] = new Charakterkasten(
                    "Kokosnuss",
                    (double)(3*kasten+2*lucke),
                    (double)(3*kasten+2*lucke),
                    "img/ananas_normal.png"
                );
                charakterkaesten[2] = new Charakterkasten(
                    "Eis",
                    (double)(kasten+lucke),
                    (double)(kasten+lucke),
                    "img/ananas_normal.png"
                );
                charakterkaesten[3] = new Charakterkasten(
                    "Rum",
                    (double)(3*kasten+2*lucke),
                    (double)(kasten+lucke),
                    "img/ananas_normal.png"
                );
            // Aktueller Spieler
                spielerAktuell = new Spieler(
                    (double)(kasten+lucke),
                    (double)160+kasten+2.5,
                    "img/ananas_normal.png"
                );
    }
    public static void update(){
        // male das Spiel
            draw();
        // fuehre den Spielcode aus
            // TODO: fuehre den Spielcode hier aus
    }
    public static void draw(){
        // UEbermale alte Frames
        // und setze den Hintergrund schwarz
            StdDraw.clear(new Color(0,0,0));
        // male alle initalisierten Objekte
            // male das Spielmenue
                spielmenue.draw();
            // male alle Charakterkaesten
                for (Charakterkasten obj : charakterkaesten) {
                    // falls ein Charakterkasten nicht initialisiert wurde,
                    // so ueberspringe diesen
                    if (obj==null) {
                        continue;
                    }
                    obj.draw();
                }
            // male den aktuellen Spieler
                spielerAktuell.draw();
    }
}
