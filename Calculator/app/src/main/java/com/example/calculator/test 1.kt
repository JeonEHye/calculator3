package com.example.calculator

fun main() {
    println("계산이 되길 원하는 숫자와 연산자를 '+','-','/','*'에서 차례대로 입력하세요.")
    var calc = Calculator()
    var num1 = readLine()!!.toInt()
    var myOper = readLine()!!.toString()
    var num2 = readLine()!!.toInt()

//    var isNum1Pass=true
//    var isOperPass=true
//    var isNum2Pass=true
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
        else{
            var Result= println("연산자는 '+','-','/','*' 중에서 입력하세요. 연산자 오류로 종료됩니다.")
            println(Result)
    }
}

class Calculator {

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

}