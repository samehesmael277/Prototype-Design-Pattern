fun main(args: Array<String>) {
    // Create a prototype car
    val prototypeCar = Car("SUV", "Black")

    // Clone the prototype to create a new car
    val newCar1 = prototypeCar.clone()

    // Modify the properties of the new car if needed
    newCar1.color = "Red"

    // Clone the prototype again to create another new car
    val newCar2 = prototypeCar.clone()

    // Display the details of the new cars
    println("Prototype Car: ${prototypeCar.model}, ${prototypeCar.color}")
    println("newCar1 Car: ${newCar1.model}, ${newCar1.color}")
    println("newCar2 Car: ${newCar2.model}, ${newCar2.color}")
}