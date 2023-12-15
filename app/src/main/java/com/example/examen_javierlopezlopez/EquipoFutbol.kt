package com.example.examen_javierlopezlopez

class EquipoFutbol(var nombre: String, var pais: String) {

    override fun toString(): String {
        return "Equipo -> Nombre:$nombre, País:${pais}"
    }

    fun championsLeague(listaEquipos: MutableList<EquipoFutbol>){
        var listaSorteo = listaEquipos.shuffled()

        for (i in 1..15 step 2){
            println("Equipos -> ${listaSorteo[i].nombre} vs ${listaSorteo[i].nombre}")
        }
    }

}
fun main(){
    var listaEquipos = mutableListOf<EquipoFutbol>(
        EquipoFutbol("Madrid","España"),
        EquipoFutbol("Barcelona", "España"),
        EquipoFutbol("Granada","España"),
        EquipoFutbol("Betis","España"),
        EquipoFutbol("Manchester United","UK"),
        EquipoFutbol("Manchester City", "UK"),
        EquipoFutbol("Chelsea","UK"),
        EquipoFutbol("Arsenal","UK"),
        EquipoFutbol("Juventus","Italia"),
        EquipoFutbol("Roma", "Italia"),
        EquipoFutbol("Marsella","Italia"),
        EquipoFutbol("Inter Milan","Italia"),
        EquipoFutbol("Borusia","Alemania"),
        EquipoFutbol("Inter Miami", "EEUU"),
        EquipoFutbol("khhwbqefjhwqf","Japon"),
        EquipoFutbol("hdfwf","Japon")
    )

    println("Todos los equipos:")
    for(equipo in listaEquipos){
        println(equipo)
    }

    println(".....................................")
    println("Sorteo")

    var instancia = EquipoFutbol("","")
    println(instancia.championsLeague(listaEquipos))

}