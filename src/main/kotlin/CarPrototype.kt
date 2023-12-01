abstract class CarPrototype(var model: String, var color: String) {
    abstract fun clone(): CarPrototype
}