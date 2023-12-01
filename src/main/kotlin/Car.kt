// Concrete prototype class
class Car(model: String, color: String) : CarPrototype(model, color) {
    override fun clone(): CarPrototype {
        // Create a new instance by copying the current object
        return Car(this.model, this.color)
    }
}