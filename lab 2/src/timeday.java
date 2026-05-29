public class timeday {
    public static void main(String[] args){
        int random = (int)(Math.random() * 24);
        if(random>=5 && random<=11){
            System.out.println("Good morning");
            
        } else if (random>=12 && random<= 17) {
            System.out.println("Good afternoon");
        } else if (random>=18 && random<=23) {
            System.out.println("Good evening");


        }else{
            System.out.println("invalid hour");
        }

    }
}
