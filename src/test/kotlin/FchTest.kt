import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test

class FchTest {
    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @org.junit.jupiter.api.Test
    fun valida() {
        val fecha = Fch(15, 13, 2023)
        assertTrue(fecha.valida())
    }


    @org.junit.jupiter.api.Test
    fun fechaInvalidaDia() {
        val fecha = Fch(32, 5, 2022)
        kotlin.test.assertFalse(fecha.valida())
    }

    @org.junit.jupiter.api.Test
    fun fechaInvalidaMes() {
        val fecha = Fch(12, 13, 2021)
        // Assert.assertFalse(fecha.valida())
        kotlin.test.assertFalse(fecha.valida())
    }

    @org.junit.jupiter.api.Test
    fun fechaInvalidaFebreroBisiesto() {
        val fecha = Fch(29, 2, 2021)
        kotlin.test.assertFalse(fecha.valida())
        println("Fecha invalida")
        println(fecha.valida())
    }

    @org.junit.jupiter.api.Test
    fun fechaValidaFebreroBisiesto() {
        val fecha = Fch(29, 2, 2024)
        assertTrue(fecha.valida())
        println("Fecha valida Bisiesto")
        println(fecha.valida())
    }

}