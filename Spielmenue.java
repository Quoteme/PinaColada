// --- SpielMenue ---
//  Das Menue, welches unten vom Bildschirm dargestellt wird
//  wenn man sich im Spiel befindet.
//  In diesem Menue werden Auswaehlbare Charaktere und Powerups dargestellt

import java.awt.Color;

public class Spielmenue{
    private int hoehe;
    private int breite;
    private Color farbe;

    public Spielmenue(int pHoehe, int pBreite, Color pFarbe){
        this.hoehe = pHoehe;
        this.breite = pBreite;
        this.farbe = pFarbe;
    }

    public void draw(){
        StdDraw.setPenColor(farbe);
        StdDraw.filledRectangle(
            (double)this.breite/2,
            (double)this.hoehe/2,
            (double)this.breite/2,
            (double)this.hoehe/2
        );
    }
}
