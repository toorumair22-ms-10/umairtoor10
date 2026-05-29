 import java.util.Scanner;

public class marks_ {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Enter Total Marks:");
        double maxScore = inputReader.nextDouble();

        System.out.println("Enter Obtained Marks:");
        double userScore = inputReader.nextDouble();

        ResultCalculator report = new ResultCalculator();
        report.assignMax(maxScore);
        report.assignObtained(userScore);
        report.computeAndPrint();
    }
}

class ResultCalculator {
    private double maxMarks;
    private double scoreObtained;

    public void assignMax(double total) {
        this.maxMarks = total;
    }

    public void assignObtained(double marks) {
        this.scoreObtained = marks;
    }

    public void computeAndPrint() {
        double finalPercentage = (this.scoreObtained / this.maxMarks) * 100;
        System.out.println("Percentage calculated: " + finalPercentage + "%");
    }
}
