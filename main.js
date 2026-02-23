// Travel Weather Planner - JavaScript

// Variables
const distance_mi = 5;  // Example: 5 miles
const is_raining = false;  // Example: not raining
const has_bike = true;  // Example: has bike
const has_car = false;  // Example: no car
const has_ride_share_app = false;  // Example: no ride share app

// Check if distance_mi is falsy (0, null, undefined, false, '', NaN)
if (!distance_mi) {
    console.log(false);
}
// Distance <= 1 mile: walkable if not raining
else if (distance_mi <= 1) {
    if (!is_raining) {
        console.log(true);
    } else {
        console.log(false);
    }
}
// Distance > 1 and <= 6 miles: bikeable if has bike and not raining
else if (distance_mi <= 6) {
    if (has_bike && !is_raining) {
        console.log(true);
    } else {
        console.log(false);
    }
}
// Distance > 6 miles: need car or ride share
else {
    if (has_car || has_ride_share_app) {
        console.log(true);
    } else {
        console.log(false);
    }
}
