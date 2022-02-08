fun main() {
    var userInput: Int
    var x: String
    var y: String
    var z: String

    do{
        println("Please enter the number of the desired option below:")
        println("""
            1)Business Customer
            2)Residential Customer
            
            3)Exit
        """.trimIndent())
        print("Enter Choice Here: ")
        userInput = readLine()!!.toInt()
        if(userInput < 1 || userInput > 3)
            println("Sorry that is not a valid input. Please try a again")
    }while(userInput < 1 || userInput > 3)

    if(userInput == 1){
        println("You have selected: Business Customer")
        println("Please enter your company name")
        x = readLine()!!
        println("Please enter your name")
        y = readLine()!!
        println("Please enter your phone number")
        z = readLine()!!
        println(contact(x,y,z))
    }
    else if(userInput == 2) {
        println("You have selected: Residential Customer")
        println("Please enter your Name")
        x = readLine()!!
        println("Please enter your phone number")
        y = readLine()!!
        println(contact(x, y))
    }
    else
        println("Have a Great Day!")

}

fun contact(x: String,y: String): String{
    val combo = x+"\n"+y
    return combo
}

fun contact(x: String,y: String,z: String): String{
    val combo = x+"\n"+y+"\n"+z
    return combo
}