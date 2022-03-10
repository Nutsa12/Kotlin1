//დავალება1
fun main() {
    val numbers = listOf(29, 9, 45, 18, 95, 8, 65, 89)
    val sumEven = numbers.foldIndexed(0) { idx, sum, element -> if (idx % 2 == 0) sum + element else sum }
    println("print all numbers: ${numbers}")
    println("Sum of Numbers which are on Even index: ${sumEven}")
    println("Sum: ${numbers.sum()}")
}


//დავალება2
fun main(args: Array<String>) {
    val stringWord = "sauketesostudentiLASHA"
    var reverseWord = ""
    var length = stringWord.length

    for (i in (length - 1) downTo 0) {
        reverseWord = reverseWord + stringWord[i]
    }

    if (stringWord.equals(reverseWord, ignoreCase = true)) {
        println("True")
    } else {
        println("False")
    }
}