import static java.lang.Math.abs

/**
 * Created by crk on 22/07/2016.
 */
Scanner input = new Scanner(System.in)
print "Multiplication\nEnter 1st number: "
int number1 = input.nextInt()
print "Enter 2nd number: "
int number2 = input.nextInt()
int signOfNumber2 = (number2 < 0) ? -1 : 1
number2 = abs(number2)
int result = 0
while (number2 > 0) {
    result = result + number1
    number2--
}
println "result = " + result*signOfNumber2