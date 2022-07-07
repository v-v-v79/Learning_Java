package day06_operators.tasks;

public class Walk {
    public static void main(String[] args) {
        int temperature = 80;
        boolean rainyDay = false;
        boolean goForAWalk = temperature >= 80 && rainyDay == false;

        System.out.println("I'm gonna go for a walk: " + goForAWalk);
    }
}
