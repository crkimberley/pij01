/**
 * Created by crk on 23/07/2016.
 */
// Slightly more straightforward when done in Java with a do...while loop
Scanner input = new Scanner(System.in)
println "Program to identify an increasing consecutive sequence of positive numbers"
print "Enter number (-1 to end): "
int previous = input.nextInt()
// Initialise current to 0 to allow a later test for starting with a negative number
int current = 0
String increasing = "Yes"
// Ends for any -ve number
while (previous >= 0) {
    print "Enter number (-1 to end): "
    current = input.nextInt()
    if (current - previous != 1 && current > -1) {
        increasing = "No"
    }
    previous = current
}
// If current == 0 then 1st number entered must have been negative
println ((current != 0) ? increasing : "You started with a negative number")