/**
 * Created by crk on 22/07/2016.
 */
Scanner input = new Scanner(System.in)
print "Division\nEnter 1st number: "
int number1 = input.nextInt()
print "Enter 2nd number: "
int number2 = input.nextInt()
int quotient = 0
int remainder = number1
while (remainder >= number2) {
    quotient++
    remainder = remainder - number2
}
println number1 + "/" + number2 + " = " + quotient + ", remainder " + remainder