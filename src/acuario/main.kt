package acuario

fun main() {
    construirAcuario()
    println("===================================")
    crearPeces()
}

fun construirAcuario() {
    println("=== Acuario por defecto ===")
    val acuario1 = Acuario()
    acuario1.imprimirTamano()

    println("=== Acuario con ancho=25 ===")
    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()

    println("=== Acuario con alto=35, largo=110 ===")
    val acuario3 = Acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()

    println("=== Acuario con todos los parámetros ===")
    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
    acuario4.imprimirTamano()

    println("=== Acuario para 29 peces ===")
    val acuario6 = Acuario(numeroDePeces = 29)
    acuario6.imprimirTamano()

    println("=== Acuario con volumen modificado ===")
    val acuario7 = Acuario(numeroDePeces = 29)
    acuario7.imprimirTamano()
    acuario7.volumen = 70
    acuario7.imprimirTamano()

    println("===================================")

    println("=== Acuario rectangular (25x25x40) ===")
    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()

    println("=== Tanque Torre cilíndrico ===")
    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()

    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()
}

fun crearPeces() {
    println("=== Peces del Acuario ===")

    val tiburon = Tiburon()
    println("Tiburón - Color: ${tiburon.color}")
    tiburon.comer()

    val pezPayaso = PezPayaso()
    println("Pez Payaso - Color: ${pezPayaso.color}")
    pezPayaso.comer()
}