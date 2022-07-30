package ru.netology

fun main() {
    var likes = "201"
    var human: String

    val lastSimb = likes[likes.length - 1]
    human = if(lastSimb == '1') " человеку" else " людям"
    println("понравилось $likes$human")
}