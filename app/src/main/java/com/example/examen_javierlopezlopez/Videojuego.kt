package com.example.examen_javierlopezlopez

data class Videojuego(val nombre: String, val plataforma: String, val anSalida: Int){

    override fun toString(): String {
        return "Videojuego -> Nombre:${nombre}, Plataforma:${plataforma}, Año de salida:${anSalida}"
    }







}
fun main(){
    var listaJuegos = listOf<Videojuego>(
        Videojuego("Fifa", "PS5", 2023),
        Videojuego("GTA5", "PC", 2015)
    )

    println("Lista de juegos")
    for(juego in listaJuegos){
        println(juego)
    }


    println(".................................")
    println(filtraJuegos(listaJuegos, 2023))

    //println(".................................")
    //println(mapaJuegos(listaJuegos, ))

    println(".................................")
    println(plataformas(listaJuegos))


}

fun filtraJuegos(listaJuegos: List<Videojuego>, an: Int): List<Videojuego>{
    return listaJuegos.filter { it.anSalida == an }

}

fun mapaJuegos(listaJuegos: List<Videojuego>): Map<String, List<Videojuego>>{
    var map = mapOf<String, List<Videojuego>>()
    return map
}

fun plataformas(listaJuegos: List<Videojuego>):List<Videojuego>{
    for(juego in listaJuegos){
        println(juego.plataforma)
    }
    return listaJuegos
}