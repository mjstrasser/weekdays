package mjs

val WEEKDAYS = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

fun uniqueIds(weekdays: List<String>): Set<Char> {

    val firstLetters = weekdays.map { it.first() }
    val secondLetters = weekdays.map { it[1] }
    val thirdLetters = weekdays.map { it[2] }

    return thirdLetters.toSet()
}
