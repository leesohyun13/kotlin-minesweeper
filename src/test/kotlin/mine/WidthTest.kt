package mine

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class WidthTest {

    @Test
    fun `너비가 0보다 작은 경우 예외가 발생한다`() {
        val width = -1

        assertThrows<IllegalArgumentException> { Width(width) }
    }
}
