# Travel Weather Planner - Python

# Variables
distance_mi = 5  # Example: 5 miles
is_raining = False  # Example: not raining
has_bike = True  # Example: has bike
has_car = False  # Example: no car
has_ride_share_app = False  # Example: no ride share app

# Check if distance_mi is falsy (0, None, False, etc.)
if not distance_mi:
    print(False)
# Distance <= 1 mile: walkable if not raining
elif distance_mi <= 1:
    if not is_raining:
        print(True)
    else:
        print(False)
# Distance > 1 and <= 6 miles: bikeable if has bike and not raining
elif distance_mi <= 6:
    if has_bike and not is_raining:
        print(True)
    else:
        print(False)
# Distance > 6 miles: need car or ride share
else:
    if has_car or has_ride_share_app:
        print(True)
    else:
        print(False)
