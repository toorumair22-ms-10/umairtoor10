public class logical {
    public static void main(String[] args){
        boolean hasID= true;
        boolean isOver18= false;
        if(hasID && isOver18){
            System.out.println("Access Granted");
        }else if(hasID || isOver18){
            System.out.println("Special Guest");
        }
    }
}
