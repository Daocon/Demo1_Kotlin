package com.example.demo1.Lab2

fun main(){
    //Giai phuong trinh bac nhat ax + b = 0
    var a : Double ? = null
    var b : Double ? = null
    while (a == null){
        print("Nhap so a: ")
        a = readLine()?.toDoubleOrNull()
        if (a == null){
            println("Nhap lai so a")
        }
    }
    while (b == null){
        print("Nhap so b: ")
        b = readLine()?.toDoubleOrNull()
        if (b == null){
            println("Nhap lai so b")
        }
    }
    if (a == 0.0){
        if (b == 0.0){
            println("Phuong trinh co vo so nghiem")
        } else {
            println("Phuong trinh vo nghiem")
        }
    } else if (b == 0.0){
        println("Phuong trinh co nghiem x = 0")
    } else {
        println("Phuong trinh co nghiem x = %.2f".format(-b/a))
    }

}