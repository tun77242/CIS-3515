import kotlin.math.*

class EquilateralTriangle(_name : String) : Triangle(_name) {
    var side:Double = 0.0

    fun setDimensions(side:Double){
        super.setDimensions(side, side, side)
        this.side = side
    }

    override fun printDimensions(){
        println("The length of each side of $name is $side")
    }

    override fun getArea(): Double {
        var s: Double = (a + b + c) / 2
        return sqrt(s * (s - side) * (s-side) * (s-side))
    }
}