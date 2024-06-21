package org.thepalaceproject.deploytest.tests

import org.junit.jupiter.api.Test
import org.thepalaceproject.deploytest.library.Hello

class HelloTest {
    @Test
    fun testHello() {
        Hello.speak()
    }
}
