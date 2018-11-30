public class Spieler{
    private double x;
    private double y;
    private double r = 30;
    private double rand = 10;
    private String imgURL;

    public Spieler(double pPosX, double pPosY, String pImgURL){
        this.x = pPosX;
        this.y = pPosY;
        this.imgURL = pImgURL;
    }
    public void draw(){
         StdDraw.picture(
            this.x,
            this.y,
            this.imgURL,
            this.r*2-this.rand,
            this.r*2-this.rand
         );
     }
     public void setX(double pX){
         this.x = pX;
     }
}
