class Square(_name : String) : Shape(_name) {
    var length: Double = 0.0
    var height: Double = 0.0

    fun setDimension(length: Double, height: Double ){
        this.length = length
        this.height = height
    }

    override fun printDimensions(){
        println("For $name: The length of is $length and height is $height")
    }

    override fun getArea(): Double {
        return length * height
    }


}