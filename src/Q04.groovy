import static java.lang.Math.sqrt

/**
 * @author crkimberley 20/07/2016.
 */
print "Prime Number Checker - Enter number: "
int number = new Scanner(System.in).nextInt()
int i = 2
String answer = ""
while (i <= (int) sqrt(number)) {
    if (number % i == 0) {
        answer = "not "
        break
    }
    i++
}
println number + " is " + answer + "a prime number"