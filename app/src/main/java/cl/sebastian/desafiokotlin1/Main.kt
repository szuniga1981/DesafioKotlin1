package cl.sebastian.desafiokotlin1


fun main(){
    getNombre()
  getByteMax()
    getshortMin()
    getSumaVariables()
    getPersonajes()
    getFlotante()
    getMinIntLong()
    getBoolean()
    imprimiendoParametros("homero","Simpson")
    imprimirIVA()

}
//3.Imprimir “Mi nombre es: {Nombre del alumno}
fun getNombre(){
    val nombre ="sebastian Zuniga"
    println(nombre)
}
//4.Declarar 3 variables numéricas con los valores “10”, “20” y “30”.
//5.Imprimir la suma de las 3 variables.
fun getSumaVariables(){
        val a = 10
        val b = 20
        val c = 30
        val resultado = a + b + c
        println("$a + $b + $c = $resultado")

}
//6.Declarar 1 variable String y otra variable Char.
//7. Asignarle el valor “Arataka Reigen” a la variable String y “A” a la variable Char.
//8.Imprimir la cantidad de caracteres que tiene la variable String y modificar la variable char a otro valor distinto**

fun getPersonajes(){
    val letra = 'A'
    val personaje= "Arataka Reigen"

    val stringPersonaje="el personaje tiene ${personaje.length} caracteres"

    println(stringPersonaje)
}
//9. Declarar una variable de tipo Float de forma explícita.
//10. Asignar un valor a la variable Float.
//11. Imprimir los valores máximos que pueden almacenar las variables Byte y Short.
//12. Imprimir los valores mínimos que pueden almacenar las variables Int y Long

fun getFlotante(){
    val flotante=10F
    println(flotante)
}

fun getByteMax(){
    val max = Byte.MAX_VALUE
    println(max)

}
fun getshortMin(){
    val max =Short.MAX_VALUE
    println(max)
}
fun getMinIntLong() {
    val min1 = Int.MIN_VALUE
    val min2 = Long.MIN_VALUE
    println(min1)
    println(min2)
}
//13. Declarar una variable Boolean con true o false e imprimir su valor.

fun getBoolean() {
    val x = true
    println(x)

}
//14. Crear una función llamada “imprimiendoParametros” que recibe 2 parámetros String y este imprime el total de caracteres de los dos parámetros.
//15. Crear una función llamada “obtieneIVA” que devuelve el valor del IVA (19%).
//16. Desde la función main llamar a estas dos funciones de forma correcta.
fun imprimiendoParametros(pa:String,pb:String) {


    val resultado = pa.length + pb.length

    val stringPersonajes =  ("${pa.length} + ${pb.length}=$resultado")

    println(stringPersonajes)
}
//15. Crear una función llamada “obtieneIVA” que devuelve el valor del IVA (19%).
fun imprimirIVA(){

    val iva =1.19F
    val valor=1000
    val resultado=valor*iva

    println(resultado)
}
