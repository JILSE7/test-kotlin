const val pi = 3.1416f

fun main() {
    println("INIT DEVELOP")
    println("Hola cara de bola")
    val a = 5
    val b = 6

    val result = a + b
    println(result)

    println(pi)
    println(result)

    println("JAJAJA")

    val presentarse: (Int, String) -> String = {name, age -> "Me llamo $name y tengo $age años"}
}

fun getPi () = pi

