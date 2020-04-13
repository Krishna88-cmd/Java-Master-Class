package SecondAndMinutesChllenges;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));

    }
    private static String getDurationString(long minutes ,long second){
        if (( minutes < 0)  || (second < 0) || (second >59)) {
            return "invalid value" ;
        }
        long hours = minutes / 60;
        long remainingMunites = minutes % 60;
        return  hours + "h" + remainingMunites + "m" + second + "s";


    }
    private static String getDurationString(long seconds){
        if ( seconds <0){
            return "invalid value";
        }
        long minutes = seconds /60;
        long remainingSecond = seconds % 60;
        return getDurationString(minutes,seconds);
    }


}
