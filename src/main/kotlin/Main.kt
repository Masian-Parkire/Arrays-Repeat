fun main() {
    takesInNames(arrayOf("Kevin","Ian","Snaida","Tevin"))
    namesOfCities(arrayOf<String>())
    takesNumbers(arrayOf())
    var cereals = takesInNam(arrayOf("Beans","maize","wheat"))
    println(cereals)

}

fun takesInNames(names:Array<String>) {
    println(names.contentToString())

}
fun namesOfCities(cities:Array<String>){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { names ->
        println(names.capitalize())
    }
}
fun takesNumbers(numbers:Array<Int>){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1].plus(numbers[4])
    println(sum)
    var index = numbers.indexOf(158)
    println(index)
    var sortedNumbers = numbers.sortedArray()
    println(sortedNumbers.contentToString())

}
fun takesInNam(nam: Array<String>):String{
    var nam = nam.contentToString()
    return nam


}