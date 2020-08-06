package curso.udemy
fun main (args:Array< String>){
    // se pueden hacer de dos formas con una variable que en este caso seria la "i= 2" de esta manera imprime la posicion numero 2 que en este caso seria el numero 6, o directamente sobre el println//
    var i =2
    var arreglo1:Array<Int> = arrayOf (2,4,6)
    println(arreglo1[i]) // imprimira el numero 6 que es la posicion 2


    var arreglo:Array<String> = arrayOf("azul","amarillo","verde","violeta")
    println (arreglo[3]) //imprimira violeta

    var indice = 0
    var arreglo2:Array<Int> = arrayOf(20,30,40)
    println(arreglo2[indice]) // imprimira el numero 20

}
