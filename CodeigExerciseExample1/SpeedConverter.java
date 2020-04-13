package CodeigExerciseExample1;

public class SpeedConverter {
    public static void main(String[] args) {

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {

            return -1;
        }

        return Math.round(kilometersPerHour / 1.069);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("invalid value");
        } else {
            long milesPerHour=toMilesPerHour((kilometersPerHour));
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h ");
        }
    }
}

