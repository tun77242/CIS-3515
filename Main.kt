fun main(args: Array<String>) {
    var sq: Shape = Shape("Square")
    var cir: Shape = Shape("Circle")
    var tri: Shape = Shape("Triangle")
    var eqTri: Shape = Shape("EquilateralTriangle")

    print("Enter length of square: ")
    val length = readLine()!!

    print("Enter height of square: ")
    val height = readLine()!!

    print("Enter radius of circle: ")
    val radius = readLine()!!

    print("Enter length of side 1 of triangle: ")
    val a = readLine()!!
    print("Enter length of side 2 of triangle: ")
    val b = readLine()!!
    print("Enter length of side 3 of triangle: ")
    val c = readLine()!!

    print("Enter length of only side of equilateral triangle: ")
    val side = readLine()!!

    println(sq.name)
    println(sq.printDimensions())
    println("Area: " + sq.getArea())

    println(cir.name)
    println(cir.printDimensions())
    println("Area: " + cir.getArea())

    println(tri.name)
    println(tri.printDimensions())
    println("Area: " + tri.getArea())

    println(eqTri.name)
    println(eqTri.printDimensions())
    println("Area: " + eqTri.getArea())


}