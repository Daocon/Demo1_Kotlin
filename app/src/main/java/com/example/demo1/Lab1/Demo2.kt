package com.example.demo1.Lab1

fun main(){
    // nhap 2 so tu ban phim, viet chuong trinh tinh tong hieu tich thuong cua 2 so do,
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
    println("Tong cua 2 so $a va $b la: %.2f".format(a+b))
    println("Hieu cua 2 so $a va $b la: %.2f".format(a-b))
    println("Tich cua 2 so $a va $b la: %.2f".format(a*b))
    if (b != 0.0){
        println("Thuong cua 2 so $a va $b la: %.2f".format(a/b))
    }else{
        println("Khong the chia cho 0")
    }

}
