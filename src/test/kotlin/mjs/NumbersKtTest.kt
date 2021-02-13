package mjs

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class NumbersKtTest : DescribeSpec({

    describe("uniqueIds()") {
        describe("for simple words") {
            it("returns unique letters for one-letter words") {
                uniqueIds(setOf("a", "b", "c")) shouldBe setOf('a', 'b', 'c')
            }
            it("returns unique letters for short words") {
                uniqueIds(setOf("ab", "ac", "d")) shouldBe setOf('b', 'c', 'd')
            }
            it("cannot find unique letters for overlapping words") {
                uniqueIds(setOf("ab", "ac", "ace")) shouldBe null
            }
            it("cannot find unique letters for an empty set") {
                uniqueIds(setOf()) shouldBe null
            }
        }
        describe("for weekdays and months") {
            it("cannot find unique letters for weekdays in English") {
                uniqueIds(
                    setOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
                ) shouldBe null
            }
            it("cannot find unique letters for weekdays in German") {
                uniqueIds(
                    setOf("Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sontag")
                ) shouldBe null
            }
            it("cannot find unique letters for weekdays in French") {
                uniqueIds(
                    setOf("Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche")
                ) shouldBe null
            }
            it("cannot find unique letters for weekdays in Italian") {
                uniqueIds(
                    setOf("lunedì", "martedì", "mercoledì", "jovedì", "venerdì", "sabato", "domenica")
                ) shouldBe setOf('l', 't', 'c', 'j', 'v', 's', 'd')
            }
            it("cannot find unique letters for months of the year") {
                uniqueIds(
                    setOf(
                        "January", "February", "March", "April", "May", "June",
                        "July", "August", "September", "October", "November", "December"
                    )
                ) shouldBe null
            }
        }
    }
})
