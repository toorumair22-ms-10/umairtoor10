package polymorphism;

public class POLYMORPHISM {
    public static  void main(String[]args){
        area a1=new area();
        a1.area(4.00f);
        //a1.area(4.00d);
        PolymorphismDemo d=new PolymorphismDemo();
        d.area(4.00f);
        area a2=new PolymorphismDemo();
        a2.area(4.00f);



    }
}
class area{
    float radius;
    Double length;
    float height;
    Double AREA;
    public void area(float radius){//circle
        this.AREA=(2.00)*(radius*radius);
        System.out.println("Area Of circle is:"+AREA);
    }
   final public void area1(Double length){// square
        this.length=length;
        this.AREA=this.length*this.length;
        System.out.println("Area Of Square is:"+AREA);
    }

}

    class PolymorphismDemo extends area{
        @Override
        public void area(float radius){//circle
            this.AREA=(4.00)*(radius*radius);
            System.out.println("Area Of circle is:"+AREA);
        }

        /*public void area1(Double length){// square it will generate error here
            this.length=length;
            this.AREA=this.length*this.length;
            System.out.println("Area Of Square is:"+AREA);
        }*/


    }


