package com.lannstark.lec01

class Variables {
}

fun main() {

    var number1 = 10L
    val number2 = 20L

    var number3: Long? = 1000L
    number3 = null
    var person = Person("bang")

    println(number1)
    println(number2)
    println(number3)
    println(person)
}

/**
 * 0. var: 변경 가능 / val: 변경 불가능
 * 1. 초깃값을 지정하지 않는 경우 타입을 명시해줘야 한다.
 * 2. Tip. 모든 변수는 우선 val 로 선언하고, var 는 나중에 변경이 필요할 때만 사용한다.
 * 3. Kotlin 에서 null 값이 변수에 들어갈 수 있다면 "타입?" 를 사용해야 한다. 그렇지 않으면 null 이 들어갈 경우 컴파일 에러
 * 4. Kotlin 에서 객체 생성 시 new 키워드를 사용하지 않는다.
 * 5. Primitive Type 과 Reference Type 의 구분이 없다. (내부적으로 최적화 진행)
 */