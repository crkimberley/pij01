import static java.lang.Math.abs

/**
 * Created by crk on 22/07/2016.
 */
Scanner input = new Scanner(System.in)
print "Division\nEnter 1st number: "
int number1 = input.nextInt()
print "Enter 2nd number: "
int number2 = input.nextInt()
boolean negative1 = number1 < 0
boolean negativeQuotient = negative1 != number2 < 0
int quotient = 0
int remainder = abs(number1)
number2 = abs(number2)
while (remainder >= number2) {
    quotient++
    remainder = remainder - number2
}
print number1 + "/" + number2 + " = " + (negativeQuotient ? 0 - quotient : quotient)
println ", remainder " + (negative1 ? 0 - remainder : remainder)