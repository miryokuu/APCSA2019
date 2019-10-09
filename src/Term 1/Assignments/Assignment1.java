import java.util.Scanner;

/*
 * Rename this class to Main!
 */
final class Assignment1 {
    public static final String TEMPLATE_STRING = "Average website rating: %.15f\n"
            + "Average focus group rating: %.1f\n" + "Average movie critic rating: %.2f\n"
            + "Overall movie rating: %.14f";

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] rateReviewWeb = new int[3];
        double[] rateFocusGroup = new double[2];
        double avgCrtRating, avgWebRating, avgFGroupRating;

        System.out.println("Please enter ratings from the movie review website.");
        rateReviewWeb[0] = input.nextInt();
        rateReviewWeb[1] = input.nextInt();
        rateReviewWeb[2] = input.nextInt();

        avgWebRating = (double) (((double) rateReviewWeb[0] + (double) rateReviewWeb[1] + (double) rateReviewWeb[2])
                / 3);

        System.out.println("Please enter ratings from the focus group.");
        rateFocusGroup[0] = input.nextDouble();
        rateFocusGroup[1] = input.nextDouble();

        avgFGroupRating = (rateFocusGroup[0] + rateFocusGroup[1]) / 2;

        System.out.println("Please enter the average movie critic rating.");
        avgCrtRating = input.nextDouble();

        // System.out.println(String.format(TEMPLATE_STRING, avgWebRating,
        // avgFGroupRating, avgCrtRating,
        // (avgWebRating*0.20)+(avgFGroupRating*0.30)+(0.5*avgCrtRating)));
        // WHY IS THIS BROKEN

        System.out.println(
                "Average website rating: " + avgWebRating + "\nAverage focus group rating: " + avgFGroupRating
                        + "\nAverage movie critic rating: " + avgCrtRating + "\nOverall movie rating: "
                        + ((avgWebRating * 0.20) + (avgFGroupRating * 0.30) + (0.5 * avgCrtRating))
        );
        input.close();
    }
}