/**
 * Created by crk on 22/07/2016.
 */
Scanner input = new Scanner(System.in)
print "Multiplication\nEnter 1st number: "
int number1 = input.nextInt()
print "Enter 2nd number: "
int number2 = input.nextInt()
int result = 0
for (i=1;i<=number2;i++) {
    result = result + number1
}
println "result = " + result