import java.util.Scanner


fun main() {


    println("\n")

    // Task 1

    var array1 = arrayOf<Int>(10, 2, 22, 21, 53, 5)

    for ((index, item) in array1.withIndex()) {
        println("Index: ${index}; Item: ${item} ")
    }

    println("\n")

    var array2 = arrayOf<String>("Cat", "Dog", "Horse", "Wolf")

    for ((index, item) in array2.withIndex()) {
        println("Index: ${index}; Item: ${item} ")
    }

    println("\n")

    var array3 = arrayOf<Double>(-2.1, 2.0, 0.0, 1.5)

    for ((index, item) in array3.withIndex()) {
        println("Index: ${index}; Item: ${item} ")
    }

    println("\n")

    var array4 = arrayOf<Any>(0, "Any", -2.2)

    for ((index, item) in array4.withIndex()) {
        println("Index: ${index}; Item: ${item} ")
    }


    println("\n")

    // Task 2

    var scanner = Scanner(System.`in`)

    var inputArray = arrayOf("", "", "", "")

    for ((index, item) in inputArray.withIndex()) {
        print("${index + 1}) Enter: ")

        var data = scanner.next();
        inputArray[index] = data;
    }

    for ((index, item) in inputArray.withIndex()) {
        println("Index: ${index}; Item: ${item} ")
    }


    println("\n")

    // Task 3

    var inputDoubleArray = arrayOf<Double>(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0)

    for ((index, item) in inputDoubleArray.withIndex()) {
        print("${index + 1}) Enter: ")

        var data = scanner.nextDouble();
        inputDoubleArray[index] = data;
    }

    for ((index, item) in inputDoubleArray.withIndex()) {
        println("Index: ${index}; Item: ${item} ")
    }

    var sum = 0.0

    for (i in inputDoubleArray) {
        sum += i
    }

    println("Average*2 = "+(sum / inputDoubleArray.count()) * 2)




    println("\n")

    // Task 4

    var inchArray = arrayOf<Double>(0.0, 0.0, 0.0, 0.0, 0.0)
    var cmArray = arrayOf<Double>(0.0, 0.0, 0.0, 0.0, 0.0)

    for ((index, item) in inchArray.withIndex()) {
        print("${index + 1}) Enter inch: ")

        var data = scanner.nextDouble();
        inchArray[index] = data;
    }

    for ((index, item) in cmArray.withIndex()) {

        cmArray[index] =  inchArray[index]*2.54
    }

    for (i in cmArray) {
        println("InchtoCm = ${i}")
    }

    for ((index, item) in inchArray.withIndex()) {

        println("${inchArray[index]} -> ${cmArray[index]}")
    }


    }


