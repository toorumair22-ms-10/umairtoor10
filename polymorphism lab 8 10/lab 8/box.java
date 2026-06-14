package INHERITENCE;

class measurements {

    float length;
    float width;
    float height;
    float perimeter;
    float squareArea;
    float boxVolume;

    measurements(float side) {
        this.length = side;
        squareArea = this.length * this.length;
        System.out.println("area = " + squareArea);
    }

    measurements(float length, float width) {
        this(1, 2, 3); // Calls the 3-parameter constructor
        this.length = length;
        this.width = width;
        this.perimeter = 2 * (this.length + this.width);
    }

    private void showPerimeter() { // This method is not inherited
        System.out.println("perimeter = " + this.perimeter);
    }

    private measurements(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
        boxVolume = this.height * (this.length * this.width);
        System.out.println("volume = " + boxVolume);
    }

    measurements(measurements obj) {
        this.length = obj.length;
        this.width = obj.width;
        this.height = obj.height;

        System.out.println("ITS OVERLOADING");
        System.out.println(length + "\n" + width + "\n" + height);
    }
}

class box extends measurements {

    box() {
        super(1, 2);
        // super(1,2,3); // Cannot call because it is private
        System.out.println("HEY BOX I'M HERE.");
    }

    void displayBox() {
        System.out.println("I AM BOX");
    }
}
