package vectorFieldGenerator;
public class Vector {
    // Created by Lochlin S. Craig
    private double x;
    private double y;
    private double magnitude;
    public Vector(double angle) {
        this.magnitude = 1.0;
        this.x = this.magnitude * Math.cos(angle);
        this.y = this.magnitude * Math.sin(angle);
    }
    public Vector(double angle, double mag) {
        this.magnitude = mag;
        this.x = this.magnitude * Math.cos(angle);
        this.y = this.magnitude * Math.sin(angle);
    }
    public Vector(int x, int y){
        this.x = x;
        this.y = y;
        this.magnitude = this.calMagn();
    }
    public double getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void add(Vector v){
        this.x += v.getX();
        this.y += v.getY();
        this.magnitude = this.calMagn();
    }
    public double calMagn(){
        double mag = Math.sqrt( (Math.pow(x, 2) + Math.pow(y, 2)) );
        return mag;
    }
    public void limitMag(int limit){
        this.x = this.x * limit / this.magnitude;
        this.y = this.y * limit / this.magnitude;
        this.magnitude = this.calMagn();
    }
    //prints out vector in string of each individual vector
    public String toString() {
        return "Vector{" + "x=" + x + ", y=" + y + ", magnitude=" + magnitude + '}';
    }
}