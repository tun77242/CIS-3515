class Circle(_name : String) : Shape(_name) {
    var radius: Double = 0.0

    fun setDimensions(radius: Double){
        this.radius = radius
    }

    override fun printDimensions(){
        println("The radius of $name is $radius")
    }

    override fun getArea(): Double {
        return radius * radius * 3.14
    }
}