import static java.lang.Math.random

/**
 * Created by crk on 19/07/2016.
 */
Scanner input = new Scanner(System.in)
print "Tell me something: "
switch (input.next()) {
    case "red":
        println "Red is a colour"
        break
    case "dog":
        println "A dog is an animal"
        break
    default:
        println "Not sure about that"
        break
}
println "Now enter a number"
switch (input.nextInt()) {
    case 7:
        println "Thanks - that's seven"
        break
    case 31:
        println "Thanks - that's 31"
        break
    default:
        println "Don't know that number"
        break
}

enum Pet {
    CAT,
    SNAKE,
    LIZARD,
    FISH
}

println "Enter a type of pet"
switch (Pet.valueOf(input.next())) {
    case Pet.CAT:
        println "Cats eat fish"
        break
    case Pet.SNAKE:
        println "Snakes like to hiss"
        break
    case Pet.LIZARD:
        println "Lizards are reptiles"
        break
    case Pet.FISH:
        println "Fish are very tasty"
        break
    default:
        println "What kind of pet is that?"
        break
}

println()
for (i=0;i<20;i++) {
    randomNumber = 3*random()
    print "Random number 0-2: " + randomNumber + "\t\t"
    switch ((int) randomNumber) {
        case 0:
            println "Jake wears his trousers on his head"
            break
        case 1:
            println "Elizabeth & Poppy like Jake a lot"
            break
        case 2:
            println "Lost In Song is a great piece of music"
            break
        default:
            println "What's happened?"
            break
    }
}