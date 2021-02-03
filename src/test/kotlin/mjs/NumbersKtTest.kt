package mjs

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class NumbersKtTest : DescribeSpec({

    val weekdays = setOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val months = setOf(
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    )

    describe("uniqueIds()") {
        it("returns unique letters for the days in the week") {
            uniqueIds(weekdays) shouldBe setOf('M', 'e', 'W', 'h', 'F', 'a', '.')
        }
        it("returns unique letters for months of the year") {
            uniqueIds(months) shouldBe setOf('a', 'F', 'c', 'p', 'y', '.', 'l', 'g', 'S', 'O', 'N', 'D')
        }
    }
})
