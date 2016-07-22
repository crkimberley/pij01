/**
 * Created by crk on 22/07/2016.
 */
Scanner input = new Scanner(System.in)
println "Program to find highest number from sequence of positive numbers"
int highestNumber = -1
while (true) {
    print "Enter number: "
    int number = input.nextInt()
    if (number == -1) {
        break
    }
    if (number > highestNumber) {
        highestNumber = number
    }
}
println "Highest number: " + highestNumber
