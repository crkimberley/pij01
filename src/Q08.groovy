/**
 * Created by crk on 22/07/2016.
 */
Scanner input = new Scanner(System.in)
println "Program to find highest number from sequence of positive numbers"
int number = 0
int highestNumber = -1
while (number != -1) {
    print "Enter number (-1 to end): "
    number = input.nextInt()
    if (number > highestNumber) {
        highestNumber = number
    }
}
println "Highest number: " + highestNumber
