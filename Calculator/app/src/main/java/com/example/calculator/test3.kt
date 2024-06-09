package com.example.calculator
// AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기),
// DivideOperation(나누기) 연산 클래스를을 만든 후 클래스간의 관계를 고려하여
// Calculator 클래스와 관계를 맺기
//- 관계를 맺은 후 필요하다면 Calculator 클래스의 내부 코드를 변경하기
//- 나머지 연산자(%) 기능은 제외합니다.
//- Lv2 와 비교하여 어떠한 점이 개선 되었는지 스스로 생각해 봅니다.
//- hint. 클래스의 책임(단일책임원칙)


// 각 연산을 수행하는 인터페이스 정의
interface Operation {
    fun operate(num1: Int, num2: Int): Int
}

// 덧셈 연산 클래스
class Addition : Operation {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}

// 뺄셈 연산 클래스
class Subtraction : Operation {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 - num2
    }
}

// 곱셈 연산 클래스
class Multiplication : Operation {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 * num2
    }
}

// 나눗셈 연산 클래스
class Division : Operation {
    override fun operate(num1: Int, num2: Int): Int {
        return num1 / num2
    }
}

// Calculator 클래스
class Calculator {
    private val operations: Map<String, Operation> = mapOf(
        "+" to Addition(),
        "-" to Subtraction(),
        "*" to Multiplication(),
        "/" to Division()
    )

    fun calculate(num1: Int, operatorStr: String, num2: Int): Int {
        val operation = operations[operatorStr]
            ?: throw IllegalArgumentException("Invalid operator: $operatorStr")
        return operation.operate(num1, num2)
    }

    fun calculateWithResult(result: Int, bonusOperatorStr: String, num2: Int): Int {
        val operation = operations[bonusOperatorStr]
            ?: throw IllegalArgumentException("Invalid operator: $bonusOperatorStr")
        return operation.operate(result, num2)
    }
}

fun main() {
    val calc = Calculator()

    println("계산이 되길 원하는 숫자와 연산자를 차례대로 입력하세요.")
    var num1 = readLine()!!.toInt()
    var operatorStr: String
    var num2: Int
    var result: Int

    while(true) {
        operatorStr = readLine()!!.toString()
        if (operatorStr !in setOf("+", "-", "*", "/")) {
            println("연산자는 '+','-','/','*' 중에서 입력하세요.")
            continue // 올바른 연산자가 입력될 때까지 반복
        }
        break // 올바른 연산자가 입력되면 반복 종료
    }

    num2 = readLine()!!.toInt()

    result=calc.calculate(num1, operatorStr, num2)
    println("결과: $result")

    while (true) {
        println("추가로 계산되길 원하는 숫자를 입력하거나 -1를 입력하여 종료하세요.")
        val bonusNum = readLine()!!.toInt()
        if (bonusNum < 0) {
            println("종료합니다")
            break
        }

        println("연산자는 '+','-','/','*' 중에서 하나를 입력하면 연산이 진행됩니다.")
        val bonusOperator = readLine()!!.toString()

        result = calc.calculateWithResult(result, bonusOperator, bonusNum)
        println("추가 연산 결과: $result")
    }
}
