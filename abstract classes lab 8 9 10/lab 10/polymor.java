package polymorphism;

public class polymor {
    public static void main(String[] args) {

        ShapeCalculator shapeObj = new ShapeCalculator();
        shapeObj.calculateCircle(4.00f);
        // shapeObj.calculateCircle(4.00d);

        AdvancedCalculator advancedObj = new AdvancedCalculator();
        advancedObj.calculateCircle(4.00f);

        ShapeCalculator referenceObj = new AdvancedCalculator();
        referenceObj.calculateCircle(4.00f);
    }
}

class ShapeCalculator {

    float circleRadius;
    Double sideLength;
    float rectangleHeight;
    Double result;

    public void calculateCircle(float circleRadius) { // Circle
        this.result = 2.00 * (circleRadius * circleRadius);
        System.out.println("Area Of Circle is: " + result);
    }

    final public void calculateSquare(Double sideLength) { // Square
        this.sideLength = sideLength;
        this.result = this.sideLength * this.sideLength;
        System.out.println("Area Of Square is: " + result);
    }
}

class AdvancedCalculator extends ShapeCalculator {

    @Override
    public void calculateCircle(float circleRadius) { // Circle
        this.result = 4.00 * (circleRadius * circleRadius);
        System.out.println("Area Of Circle is: " + result);
    }

    /*
    public void calculateSquare(Double sideLength) { // Square
        this.sideLength = sideLength;
        this.result = this.sideLength * this.sideLength;
        System.out.println("Area Of Square is: " + result);
    }
    */
}