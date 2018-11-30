// --- Charaterkasten ---
//  Ein Kasten, welcher einen Charakter darstellt, welcher ausgewählt werden
//  kann, um mit diesem waehrend des Spiels zu spielen.

import java.awt.Color;

public class Charakterkasten{
    private double  x;
    private double  y;
    private double  r               = 30;
    private double  rand            = 10;
    private Color   hintergrundFarbe= new Color(0,0,0);
    private Color   randFarbe       = new Color(255,255,255);
    private String  imgURL;
    private String  typ;

    public Charakterkasten(String pTyp, double pPosX, double pPosY, String pImgURL){
        this.typ = pTyp;
        this.x = pPosX;
        this.y = pPosY;
        this.imgURL = pImgURL;
    }

    public void draw(){
        // fülle den Hintergrund des Charakterkasten
            StdDraw.setPenColor(this.hintergrundFarbe);
            StdDraw.filledSquare(this.x, this.y, this.r);
        // male den Rand des Charakterkasten
            StdDraw.setPenColor(this.randFarbe);
            StdDraw.square(this.x, this.y, this.r);
        // male den eigentlichen Charakter
             StdDraw.picture(
                this.x,
                this.y,
                this.imgURL,
                this.r*2-this.rand,
                this.r*2-this.rand
             );
    }
}
