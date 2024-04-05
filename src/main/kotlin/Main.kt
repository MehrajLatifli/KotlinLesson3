import java.util.Scanner


fun main() {


  /*  println("\n")

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
    } */


    println("\n")

    // Task 5


    var stringArray = arrayOf("BMW","KIA","Opel","Volvo","Ford","Hyundai","Honda","Nissan")

    println(stringArray.contains("Nissan"))
    println(stringArray.indexOf("Nissan"))
    println(stringArray.contentToString())
    println(stringArray.isEmpty())
    println(stringArray.first())
    println(stringArray.last())
    println(stringArray.count())

    stringArray+="New car"
    println(stringArray.contentToString())


    println("\n")

    // Task 6


    val intArray = arrayOf<Int>(11, 1, 10, -55, -5, -2, 0, 2)

    println(intArray.max())
    println(intArray.min())

    println("\n")

    for (i in intArray) {
        print("${i} ")
    }

    intArray.reverse()
    println("\n")

    for (i in intArray) {
        print("${i} ")
    }

    intArray.sort()
    println("\n")

    for (i in intArray) {
        print("${i} ")
    }

    println("\n\nAverage ${intArray.average()}")


    println("\n")

    // Task 7


    val getSetarray = arrayOf(10, "Baku", -30.45, 45, 18,"Ankara")

    println("getSetarray: ${getSetarray.contentToString()}")

    val element1 = getSetarray.get(1)
    val element2 = getSetarray.get(2)

    println("Element at index=${getSetarray.indexOf(element1)}: $element1")
    println("Element at index=${getSetarray.indexOf(element2)}: $element2")

    getSetarray.set(getSetarray.indexOf(element1), "Tabriz")
    getSetarray.set(getSetarray.indexOf(element2), 4305)

    println("Updated getSetarray: ${getSetarray.contentToString()}")

    println("\n")

    // Task 8

    val differentItemarray = arrayOf(-1, "Baku", -3.18, 81, 7,false)
    println("differentItemarray: ${differentItemarray.contentToString()}")

    val find = differentItemarray.find { it == "Baku" }
    println("Find: ${find}")

    val filter = differentItemarray.filter { it == -3.18 }
    println("Filter: ${filter}")

    differentItemarray.forEachIndexed { index, element ->
        print("${index}) ${element}  ")
    }

}


