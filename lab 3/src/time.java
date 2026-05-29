import java.util.Scanner;
class seconds{
    private int hour;
    private int minutes;
    private int seconds;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public void whatTime( int no_of_seconds_till_noon){
        int h = no_of_seconds_till_noon / 3600;
        int remaining_seconds = no_of_seconds_till_noon % 3600;
        int min= remaining_seconds / 60;
        int second= remaining_seconds % 60;
        setHour(h);
        setMinutes(min);
        setSeconds(second);
    }




    public void display(){
        System.out.println("hour" + " " +  getHour() + " " + "minutes" + " " + getMinutes() + " seconds" + " " + getSeconds());

    }
}
public class time {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the seconds till noon");
        int sec = sc.nextInt();
        seconds t1= new seconds();
        t1.whatTime(sec);
        t1.display();


    }

}
