package com.example.demo1.Lab2

fun main(){
    var month : Int? = null
    while (month == null || month < 1 || month > 12){
        print("Nhập tháng: ")
        month = readlnOrNull()?.toIntOrNull()
        if (month == null || month < 1 || month > 12){
            println("Nhập lại tháng: ")
        }
    }
    when(month){
        1, 2, 3 -> println("Tháng $month thuộc quý 1")
        4, 5, 6 -> println("Tháng $month thuộc quý 2")
        7, 8, 9 -> println("Tháng $month thuộc quý 3")
        10, 11, 12 -> println("Tháng $month thuộc quý 4")
    }
}