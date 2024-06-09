package com.example.calculator2

fun main() {
    var calc = Calculator2()


    println("계산이 되길 원하는 숫자와 연산자를 차례대로 입력하세요.")
    var num1 = readLine()!!.toInt()
    var myOper: String
    var num2: Int
    var result: Int

    while(true) {
        myOper = readLine()!!.toString()
        if (myOper != "+" && myOper != "-" && myOper != "*" && myOper != "/" && myOper != "%") {
            println("연산자는 '+','-','/','*','%' 중에서 입력하세요.")
            continue // 올바른 연산자가 입력될 때까지 반복
        }
        break // 올바른 연산자가 입력되면 반복 종료
    }

    num2 = readLine()!!.toInt()

    if (myOper == "+") {
        result = calc.add(num1, num2)
    } else if (myOper == "-") {
        result = calc.substract(num1, num2)
    } else if (myOper == "*") {
        result = calc.multiply(num1, num2)
    } else if (myOper == "/") {
        result = calc.divide(num1, num2)
    } else {
        result = calc.remainder(num1, num2)
    }

    println("결과: $result")

    while (true) {//무한 루프 시작
        println("추가로 계산되길 원하는 숫자를 입력하거나 -1를 입력하여 종료하세요.")
        var bonusNum = readLine()!!.toInt()
        if (bonusNum < 0) {
            println("종료합니다")
            break // 다음 루프 반복
        }

        println("1: +, 2: -, 3: *, 4: /, 5: % 중 하나를 입력하면 연산이 진행됩니다.")

        var bonusOper = readLine()!!.toInt()
        var bonusResult: Int = 0

        when (bonusOper) {
            1 -> {
                result = calc.add2(result, bonusNum)
            }

            2 -> {
                result = calc.substract2(result, bonusNum)
            }

            3 -> {
                result = calc.multiply2(result, bonusNum)
            }

            4 -> {
                result = calc.divide2(result, bonusNum)
            }

            5 -> {
                result = calc.remainder2(result, bonusNum)
            }

            else -> {
                println("잘못 입력 하였습니다.")
                return
            }
        }

        println("추가 연산 결과: $result")
    }
}

// 오버라이딩, 오버로딩 개념 사용 해야함.

class Calculator2 {
    fun add(num1: Int, num2: Int): Int {
        return num1+num2
    }
    fun add2(result: Int, bonusNum: Int): Int{
        return result+bonusNum
    }
    fun substract(num1: Int, num2: Int): Int {
        return num1-num2
    }
    fun substract2(result: Int, bonusNum: Int): Int{
        return result-bonusNum
    }
    fun multiply(num1: Int, num2: Int): Int {
        return num1*num2
    }
    fun multiply2(result: Int, bonusNum: Int): Int{
        return result*bonusNum
    }
    fun divide(num1: Int, num2: Int): Int {
        return num1/num2
    }
    fun divide2(result: Int, bonusNum: Int): Int{
        return result/bonusNum
    }
    fun remainder(num1: Int, num2: Int): Int {
        return num1%num2
    }
    fun remainder2(result: Int, bonusNum: Int): Int{
        return result%bonusNum
    }
}