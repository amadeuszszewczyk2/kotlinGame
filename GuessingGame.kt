import java.util.Random
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val numberToGuess = Random().nextInt(100) + 1
    var attempts = 0

    println("Welcome to the Guessing Game!")
    println("I have selected a number between 1 and 100. Try to guess it!")

    while (true) {
        print("Enter your guess: ")
        val userGuess = scanner.nextInt()
        attempts++

        if (userGuess < numberToGuess) {
            println("Too low! Try again.")
        } else if (userGuess > numberToGuess) {
            println("Too high! Try again.")
        } else {
            println("Congratulations! You've guessed the number in $attempts attempts.")
            break
        }
    }
}
