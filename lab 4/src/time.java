class jtime {
    int hour;
    int minute;
    int second;

    public jtime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int dif(jtime other){
        int total_seconds1 = this.hour * 3600 + this.minute * 60 + this.second;
        int total_seconds2 = other.hour * 3600 + other.minute * 60 + other.second;
        return total_seconds2 - total_seconds1;

    }

    public jtime difference(jtime other) {
        int total_seconds1 = this.hour * 3600 + this.minute * 60 + this.second;
        int total_seconds2 = other.hour * 3600 + other.minute * 60 + other.second;
        int diff = total_seconds2 - total_seconds1;
        int timeelapse_hour = diff / 3600;
        int timelapse_minutes = (diff % 3600) / 60;
        int timelapse_seconds = diff % 60;
        return new jtime(timeelapse_hour, timelapse_minutes, timelapse_seconds);
    }
    public jtime(int total_seconds){
        this.hour= total_seconds/3600;
        int remaining_seconds= total_seconds % 3600;
        this.minute = remaining_seconds / 60;
        this.second = remaining_seconds % 60;
    }

}


public class time {
    public static void main(String[] args) {
        jtime t1 = new jtime(10, 20, 30);
        jtime t2 = new jtime(12, 25, 38);
        jtime t3= new jtime(3783);
        System.out.println(t3.hour + ":" + t3.minute + ":" + t3.second + ":");
        int d= t1.dif(t2);
        System.out.println(d);
        jtime elapsed = t1.difference(t2);
        System.out.println(elapsed.hour + ":" + elapsed.minute + ":" + elapsed.second);
    }
}