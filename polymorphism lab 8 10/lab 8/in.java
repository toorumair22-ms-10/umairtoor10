package INHERITENCE;

public class in {
    public static void main(String[] args) {

        INHERITENCE.measurements measureRef = new INHERITENCE.box();
        INHERITENCE.box actualBox = new INHERITENCE.box();

        // measureRef.dis(); // Not allowed because through measureRef
        // we can only access the members of measurements.

    }
}
