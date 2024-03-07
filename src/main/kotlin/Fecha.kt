/**
 * Fecha
 *
 * @property dia
 * @property m: mes
 * @property a: año
 * @constructor Create empty Fecha
 */
class Fecha(private val dia: Int, private val m: Int, private val a: Int) {


    /**
     * Valida
     *
     * @return
     */
    fun valida(): Boolean {

        if (dia < 1 || dia > 31) return false
        if (m < 1 || m > 12) return false

        // determinamos la cantidad de días del mes:
        return diasdelMes()
    } // … más métodos

    /**
     * Diasdel mes compureba que el dia introducido no sea mayor que la cantidad de dias que
     * tiene ese mes controlando los años bisiestos
     *
     * @return devuelve falso si el dia introducido es mayor a la cantidad de dias del mes
     */
    private fun diasdelMes(): Boolean {
        var diasMes = 0
        when (m) {

            1, 3, 5, 7, 8, 10, 12 -> diasMes = 31
            4, 6, 9, 11 -> diasMes = 30
            2 -> diasMes = if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) 29 else 28
        }
        return if (dia > diasMes) false else true
    }
}
