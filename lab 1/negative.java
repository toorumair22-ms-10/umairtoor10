public class negative {
    public static void main(String[] args){
        int num= Integer.parseInt(args[0]);
        if (num<0){
            System.out.print("illegal input");
        }else{
            int count=0;
            while(num>=1){
                num=num/2;
                count +=1;
            }
            System.out.println("div:" + count);
        }
    }

}
