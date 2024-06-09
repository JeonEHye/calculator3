package com.example.calculator

fun main() {
    println("계산이 되길 원하는 숫자와 연산자를 차례대로 입력하세요.")
    var calc = Calculator2()
    var num1 = readLine()!!.toInt()
    var myOper = readLine()!!.toString()
    var num2 = readLine()!!.toInt()

//    var isNum1Pass=true
//    var isNum2Pass=true
//    var isOperPass=true
//
//    var opers = arrayOf("+","-","/","*")
//    for(oper in opers) {
//        if(myOper != oper) {
//            println("연산자는 '+','-','/','*' 중에서 입력하세요.")
//            isOperPass = false
//            break
//        }
//    }

//    if(isOperPass==true){
        if(myOper == "+"){
            var Result = calc.add(num1,num2)
            println(Result)
        }
        else if(myOper == "-"){
            var Result = calc.substract(num1,num2)
            println(Result)
        }
        else if(myOper == "*"){
            var Result = calc.multiply(num1,num2)
            println(Result)
        }
        else if(myOper == "/"){
            var Result = calc.divide(num1,num2)
            println(Result)
        }
        else if(myOper == "%"){
            var Result = calc.remainder(num1,num2)
            println(Result)
        }
        else{
            var Result= println("연산자는 '+','-','/','*','%' 중에서 입력하세요.")
            println(Result)
    }

    println("추가로 계산되길 원하는 숫자를 입력하거나 -1를 입력하여 종료하세요.")

    var bonusNum = readLine()!!.toInt()
    if(bonusNum>0){
        println()
    } else {
        println("종료합니다.")
    }

    println("추가로 연산되기 원하는 연산자를 입력해주세요")
    println("1번 +, 2번 -, 3번 *, 4번 /, 5번 % 중 하나를 입력하면 연산이 진행됩니다.")
}



class Calculator2 {
    fun add(num1: Int, num2: Int): Int {
        return num1+num2
    }
    fun substract(num1: Int, num2: Int): Int {
        return num1-num2
    }
    fun multiply(num1: Int, num2: Int): Int {
        return num1*num2
    }
    fun divide(num1: Int, num2: Int): Int {
        return num1/num2
    }
    fun remainder(num1: Int, num2: Int): Int {
        return num1%num2
    }
}