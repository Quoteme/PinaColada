public class Ball{
    private double radius=7.5;
    private double x;
    private double y;
    private double richtung;
    private double geschwinigkeit=1;

    public Ball(double pPosX, double pPosY, double pRichtung){
        this.x = pPosX;
        this.y = pPosY;
        this.richtung = pRichtung;
    }

    public void mapKollision(){
        if (this.x+this.radius>=400 || this.x-this.radius<=0) {
            this.richtung=Math.PI-this.richtung;
        }
        if (this.y+this.radius<=0) {
            this.richtung=-this.richtung;
        }
    }
    private void intervalCheck(){
        // setze den Richtungswinkel zurück in den Intervall 0 und 2pi
        this.richtung=this.richtung-(2*Math.PI)*Math.floor(this.richtung/(2*Math.PI));
    }
    public void bewegen(){
        this.x+=Math.cos(this.richtung)*this.geschwinigkeit;
        this.y+=Math.sin(this.richtung)*this.geschwinigkeit;
    }
    public void update(){
        bewegen();
        mapKollision();
        intervalCheck();
    }
}
