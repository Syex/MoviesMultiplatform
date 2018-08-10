package net.grandcentrix

import net.grandcentrix.network.Api

fun main(args: Array<String>) {
    println("Doing HTTP")
    Api().about {
        println("done")
        println(it)
    }
    println("end of main")
    Thread.sleep(2000)
}