// Travel Weather Planner - Java

public class TravelWeatherPlanner {
    public static void main(String[] args) {
        // Variables
        int distance_mi = 5;  // Example: 5 miles
        boolean is_raining = false;  // Example: not raining
        boolean has_bike = true;  // Example: has bike
        boolean has_car = false;  // Example: no car
        boolean has_ride_share_app = false;  // Example: no ride share app
        
        // Check if distance_mi is falsy (0)
        if (distance_mi == 0) {
            System.out.println(false);
        }
        // Distance <= 1 mile: walkable if not raining
        else if (distance_mi <= 1) {
            if (!is_raining) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
        // Distance > 1 and <= 6 miles: bikeable if has bike and not raining
        else if (distance_mi <= 6) {
            if (has_bike && !is_raining) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
        // Distance > 6 miles: need car or ride share
        else {
            if (has_car || has_ride_share_app) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
