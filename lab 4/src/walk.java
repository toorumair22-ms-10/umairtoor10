import java.util.Random;
import java.util.Scanner;
class walker{
    int x;
    int y;

    public walker(int x, int y) {
        this.x = x;
        this.y=y;
    }
    public void moveup(){
        y = y + 1;
    }
    public void movedown(){
        y = y - 1;
    }
    public void moveright(){
        x = x + 1;
    }
    public void moveleft(){
        x = x - 1;
    }
    public void display(String name ){
        System.out.println(name + " is at = (" + x + " : " + y + ")");
    }
}



public class walk {
    public static void main(String[] args){
        walker ali= new walker(0,0);
        walker hasan = new walker(0,0);
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        ali.display("ali");
        hasan.display("hasan");
        int [] hurdlex = {1,2,-1};
        int [] hurdley= {2,3,-1};
        while(true){
            System.out.println("ali where do you want to move ( ^ v > < ) ");
            char move = sc.next().charAt(0);
            if (move== '^'){
                ali.moveup();
            } else if (move == 'v') {
                ali.movedown();
            } else if (move == '>') {
                ali.moveright();
            } else if (move == '<') {
                ali.moveleft();
            }else{
                System.out.println("Invalid direction");
            }
            int direction = r.nextInt(4);
            int newx = hasan.x;
            int newy = hasan.y;
            if(direction == 0 ){
                newy += 1;
            } else if (direction== 1) {
                newy -=1;
            }else if (direction==2){
                newx +=1;
            }else if (direction == 3){
                newx -=1;
            }else {
                System.out.println("Invalid direction");
            }
            boolean hurdle = false;
            for (int i = 0; i <  hurdlex.length; i++){
                if (newx== hurdlex[i] && newy==hurdley[i]){
                    hurdle = true;
                    System.out.println("hasan  encountered a hurdle at (" + newx + "," + newy+")");
                    break;
                }
            }
            if (!hurdle){
                hasan.x=newx;
                hasan.y=newy;

            }
            ali.display("ali");
            hasan.display("hasan");
            System.out.println();

        }









    }
}
