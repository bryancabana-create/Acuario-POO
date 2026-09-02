package acuario

// Clase abstracta Pez
abstract class Pez {
    abstract val color: String
}

// Interfaz AccionPez
interface AccionPez {
    fun comer()
}

// Clase Tiburón
class Tiburon : Pez(), AccionPez {
    override val color = "gris"

    override fun comer() {
        println("El tiburón está cazando y comiendo peces")
    }
}

// Clase PezPayaso
class PezPayaso : Pez(), AccionPez {
    override val color = "dorado"

    override fun comer() {
        println("El pez payaso está comiendo algas")
    }
}