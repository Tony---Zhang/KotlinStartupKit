package com.thoughtworks.kotlinstartupkit

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).

 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {

    @Test
    @Throws(Exception::class)
    fun additionIsCorrect() {
        assertThat(2 + 2).isEqualTo(4)
    }
}