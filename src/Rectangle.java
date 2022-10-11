public class Rectangle {
    public Rectangle(int length, int width){
        this.x=0;
        this.y=0;
    }
    public Rectangle(int x, int y, int length, int width){
        this.x=y;
        this.y=y;
        this.length = length;
        this.width = width;
    }
    public void translate(int a, int b) {
        this.x=this.x+a;
        this.y=this.y+b;
    }
    public void translate(int a){
        this.x=this.x+a;
        this.y=this.y+a;
    }
    public int getX() { return this.x;}
    public int getY() { return this.y;}

    // equals method to be used for testing purposes
    public boolean equals(Rectangle other) {
        if (other instanceof Rectangle) {
            Rectangle that = (Rectangle) other;
            return this.x == that.x && this.y == that.y;
        } else {
            return false;
        }
    }

    private int x;
    private int y;
    private int length;
    private int width;
}