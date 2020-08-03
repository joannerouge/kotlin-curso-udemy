package curso.udemy

fun main ( args: Array<String>){

    val calificacion = 3
    var reseña :String

    when(calificacion){

        1 -> reseña ="No me gusto la comida, me causo nauseas."
        2-> reseña = "No me gusto, pero la bebida si"
        3 ->{println("El cliente califico con 3 estrellas")
            reseña = "Mediocre"}
        4 -> reseña = "Me gusto pero puede mejorar"
        5  -> reseña = "La mejor comida mexicana en mucho tiempo"

        else -> reseña = "reseña mal escrita"

    }

    print(reseña)

}