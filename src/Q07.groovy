/**
 * Created by crk on 22/07/2016.
 */
Scanner input = new Scanner(System.in)
println "Naive Sorting"
print "Number 1: "
int number1 = input.nextInt()
print "Number 2: "
int number2 = input.nextInt()
print "Number 3: "
int number3 = input.nextInt()
int temp
if (number2 < number1) {
    temp = number1
    number1 = number2
    number2 = temp
}
if (number3 < number2) {
    temp = number2
    number2 = number3
    number3 = temp
}
if (number2 < number1) {
    temp = number1
    number1 = number2
    number2 = temp
}
print number1 + ", " + number2 + ", " + number3