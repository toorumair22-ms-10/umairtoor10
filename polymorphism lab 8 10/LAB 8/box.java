package INHERITENCE;


 class measurements{
    float l;
    float w;
    float h;
    float parameter;
    float area;
    float volume;
    measurements(float l){
        this.l=l;
        area=this.l*this.l;
        System.out.println("area="+area);
    }
    measurements(float l,float w){
  this(1,2,3);
        this.l=l;// this will call 3 parameters constructors
        this.w=w;
        this.parameter=2*(this.l+this.w);


    }
    private void display(){// this method is not inherited
        System.out.println("parameter="+this.parameter);
    }

   private measurements(float l,float w,float h){
        this.l=l;
        this.w=w;
        this.h=h;
         volume=h*(this.l*this.w);
        System.out.println("volume="+volume);
    }
    measurements(measurements b1){
        this.l=b1.l;
        this.w=b1.w;
        this.h=b1.h;
        System.out.println("ITS OVERLOADING");
        System.out.println(l+"\n"+w+"\n"+h);

    }
}
class box extends measurements {
    box(){
        super(1,2);
//        super(1,2,3);// cannot call 3 arguments constructor because of private
           System.out.println("HEY BOX I'M HERE.");

    }
    void dis(){
        System.out.println("I AM BOX");
    }


}
