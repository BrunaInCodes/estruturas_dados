fun main() {
    val hora = 19

    if (hora < 12) {
        println("bom dia")
    } else if (hora >= 12 && hora < 18) {
        println("boa tarde")
    } else if (hora >= 18) {
        println("boa noite")
    }
}