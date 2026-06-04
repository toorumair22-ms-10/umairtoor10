interface camera{
    void click_photo();
    void click_video();
}
interface mediaplayer{
    void play_video();
    void play_audio();
}
interface gps{
    void location();
    void destination();
}
abstract class mobile{
    abstract void mobile_on();
    abstract void mobile_off();
}
class smartphone extends mobile implements camera,mediaplayer,gps{
    @Override
    void mobile_on() {
        System.out.println("mobile is on");
    }

    @Override
    void mobile_off() {
        System.out.println("mobile is off");
    }

    @Override
    public void click_photo() {
        System.out.println("click a photo");

    }

    @Override
    public void click_video() {
        System.out.println("click a video");

    }

    @Override
    public void location() {
        System.out.println("location is on");

    }

    @Override
    public void destination() {
        System.out.println("destination is found");

    }

    @Override
    public void play_video() {
        System.out.println("video is on");

    }

    @Override
    public void play_audio() {
        System.out.println("audio is playing");

    }


}
public interface int4 {
    public static void main(String[] args){
        smartphone sc = new smartphone();
        sc.click_photo();
        sc.click_video();
        sc.destination();
        sc.location();
        sc.mobile_on();
        sc.mobile_off();
        sc.play_audio();
        sc.play_video();
    }
}
