package mjs

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class NumbersKtTest : DescribeSpec({

    describe("uniqueIds()") {
        it("returns unique letters for the days in the week") {
            uniqueIds(WEEKDAYS) shouldBe setOf('M', 'e', 'W', 'h', 'F', 'a', 'n')
        }
    }

})
