class point{
    int x;
    int y;
    int z;

    public point(int x,int y,int z) {
        this.x = x;
        this.y=y;
        this.z=z;
    }
    public void display(){
        System.out.println( x + " ," + " " + y + " , " + z);
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    double distance(point p){
        int dx= p.x - this.x;
        int dy= p.y - this.y;
        int dz= p.z - this.z;
        return Math.sqrt(dx*dx + dy*dy + dz*dz);

    }
}



public class coordinates {
    public static void main(String[] args){
        point p1= new point(4,6, 7);
        point p2 = new point(6,8, 8);
        point p3 = new point(8,9,5);
        int sum= p1.getX() + p1.getY() + p1.getZ();
        System.out.println(sum);
        p1.setX(10);
        p1.setY(20);
        p1.setZ(20);
        p1.display();
        p2.display();
        p3.display();
        System.out.println("the distance is" + " " + p1.distance(p2));
        System.out.println("the distance is" + " " + p1.distance(p3));
        System.out.println("the distance is" + " " + p2.distance(p3));




    }
}
