import java.util.Scanner;

class Time {
    int hours;
    int minutes;
    int seconds;

    // Constructor to initialize the time
    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Method to calculate the time difference
    public Time difference(Time t) {
        int diffHours = this.hours - t.hours;
        int diffMinutes = this.minutes - t.minutes;
        int diffSeconds = this.seconds - t.seconds;

        // Adjust for negative seconds
        if (diffSeconds < 0) {
            diffSeconds += 60;
            diffMinutes -= 1;
        }

        // Adjust for negative minutes
        if (diffMinutes < 0) {
            diffMinutes += 60;
            diffHours -= 1;
        }

        return new Time(diffHours, diffMinutes, diffSeconds);
    }

    // Method to format time as HH:MM:SS
    public void printTime() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}

public class timedifference{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Time 1
        String[] time1Parts = sc.nextLine().split(":");
        int h1 = Integer.parseInt(time1Parts[0]);
        int m1 = Integer.parseInt(time1Parts[1]);
        int s1 = Integer.parseInt(time1Parts[2]);
        Time t1 = new Time(h1, m1, s1);

        // Input for Time 2
        String[] time2Parts = sc.nextLine().split(":");
        int h2 = Integer.parseInt(time2Parts[0]);
        int m2 = Integer.parseInt(time2Parts[1]);
        int s2 = Integer.parseInt(time2Parts[2]);
        Time t2 = new Time(h2, m2, s2);

        // Calculate and print the time difference
        Time diff = t1.difference(t2);
        diff.printTime();

        sc.close();  // Close the scanner
    }
}
/*t1.difference(t2) → Here, this refers to t1, and t refers to t2.
Inside the difference() method:
this.hours refers to the hours of t1.
t.hours refers to the hours of t2.
Thus, using this.hours - t.hours correctly calculates the difference between t1 and t2.*/