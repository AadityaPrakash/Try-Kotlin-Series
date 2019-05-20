package com.aadi.trykotlin

import java.util.*

fun main(args : Array<String>){
    println("Hello World!");

    //Immutable Variable -> Read-Only Variable
    var name = "Aaditya"

    //Immutable Variable -> As Name will not change but age will.
    var age = 27


    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int : " + bigInt)

    /*
    *    Example of String Interpolation
    *    In Strings, placeholders are replaced with their corresponding values.
    * */

    println("Smallest Int : $smallInt")

    /*
    *  Different types of variables and their values.
    *
    * */

    var bigLong: Long = Long.MAX_VALUE
    var smallLong: Long = Long.MIN_VALUE

    println("Biggest Long : " + bigLong)
    println("Smallest Long : $smallLong")

    var bigDouble: Double = Double.MAX_VALUE
    var smallDouble: Double = Double.MIN_VALUE

    println("Biggest Double : " + bigDouble)
    println("Smallest Double : $smallDouble")

    var bigFloat: Float = Float.MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE

    println("Biggest Float : " + bigFloat)
    println("Smallest Float : $smallFloat")


    if(true is Boolean)
    {
        println("true is Boolean\n")
    }

    /*
    *   Another way of String casting.
    *
    * */

    var letterGrade: Char = 'A'
    println("A is a Char : ${letterGrade is Char}")

    /*
    *
    *   String Casting
    *
    * */

    println("3.14 to Int : " + (3.14.toInt()))
    println("A to Int : " + ('A'.toInt()))
    println("65 to char : " + 65.toChar())


    val myName = "Aaditya Prakash"

    val longStr = """This is long string"""

    var fName: String = "Aaditya"
    var lName: String = "Prakash"

    fName = "Aadi"

    var fullName = fName + " " + lName
    println("Name : $fullName")
    println("1 + 2 = ${1+2}")
    println("String Length : ${longStr.length}")

    var str1 = "A random string"
    var str2 = "a random string"

    println("Strings Equal : ${str1.equals(str2)}")
    println("Compare A to B : ${"A".compareTo("B")}")

    println("2nd Index : ${str1[2]}")
    println("Index 2 - 7 : ${str1.subSequence(2,8)}")
    println("Contains random : ${str1.contains("random")}")

    /*
    *
    *   Arrays
    *   Arrays are type specific in Kotlin
    *
    * */


    var myArray = arrayOf(1, 1.23, "Aadi")
    println(myArray[2])
    myArray[1] = 3.14

    println("Array Length : ${myArray.size}")
    println("Aadi in Array : ${myArray.contains("Aadi")}")

    var partArray = myArray.copyOfRange(0,1)

    println("First : ${myArray.first()}")
    println("Aadi Index : ${myArray.indexOf("Aadi")}")

    /*
    *
    *   Collections
    *
    * */

    var sqArray = Array(5, { x -> x * x})
    println(sqArray[2])


    /*
    *
    *   Range
    *
    * */

    val oneTo10 = 1..10
    val alpha = "A".."Z"

    println("R in alpha : ${"R" in alpha}")

    var tenTo1 = 10.downTo(1)
    var twoTo20 = 2.rangeTo(20)
    val rng3 = oneTo10.step(3)

    for(x in rng3) println("rng3 : $x")
    for(x in tenTo1.reversed()) println("Reverse : $x")

    /*
    *
    *   Conditions
    *
    * */

    val mage = 8

    when(mage) {
        0, 1, 2, 3, 4 -> println("Go to Pre-School")

        5 -> println("Go to Kindergarten")

        in 6..17 -> {
            val grade = mage - 5
            println("Go to Grade $grade")
        }
        else -> println("Go to College")
    }

    /*
    *
    *   Loops
    *
    * */

    for(x in 1..10) {
        println("Loop : $x")
    }

    val rand = Random()

    val MagicNum = rand.nextInt(50) + 1

    var guess = 0;
    while(MagicNum != guess) {
        guess += 1
    }

    println("Magic Number was $guess")

    for(x in 1..20){
        if(x % 2 == 0){
            continue
        }
        println("Odd : $x")

        if(x == 15) break
    }

    var arr3 : Array<Int> = arrayOf(3,6,9)

    for(i in arr3.indices){
        println("Mult 3 ${arr3[i]}")
    }

    for((index, value) in arr3.withIndex()){
        println("Index : $index Value : $value")
    }


    /*
    *
    *   Functions
    *
    * */


    fun add(num1: Int, num2: Int) : Int = num1 + num2
    println("5 + 4 = ${add(5,4)} ")

    // Default Values
    fun subtract(num1: Int = 1, num2: Int = 2) = num1 - num2
    println("5 - 4 = ${subtract(5,4)} ")

    //Named Parameters
    println("4 - 5 = ${subtract(num2 = 5, num1 = 4)}")

    fun sayHello(name: String) : Unit = println("Hello $name")
    sayHello("aadi")

    val (two, three) = nextTwo(1)
    println("1 $two $three")

    val multiply = {num1: Int, num2:Int -> num1 * num2}

    println("5 * 3 = ${multiply(5,3)}")

    println("5! = ${fact(5)}")



}

// Return Custom type - Pair
fun nextTwo(num: Int): Pair<Int, Int>{
    return Pair(num+1, num+2)
}

fun getSum(vararg  nums: Int) : Int{
    var sum = 0;

    nums.forEach { n -> sum += n }

    return sum
}

fun fact(x: Int): Int {
    tailrec fun factTail(y: Int, z:Int): Int{
        if(y == 0) return z
        else return factTail(y -1, y *z)
    }
    return factTail(x, 1)
}