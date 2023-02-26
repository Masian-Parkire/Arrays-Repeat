import kotlin.math.pow

fun main() {
    takeNames("Kevin","Ian","Snaida","Tevin")
    namesOfCities()
    takesNumbers()
    takesInNam("Cat","Dog","Cow")
    square(4,7,8)
    number()
    roots()

}
fun takeNames(nam1:String,nam2:String,nam3:String,nam4:String){
    var names = arrayOf(nam1,nam2,nam3,nam4)
    println(names.contentToString())
}

fun namesOfCities(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    println(cities.map{it.capitalize()}.sorted())
    }
fun takesNumbers(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1]+numbers[4])
    var index = numbers.indexOf(158)
    println(index)
    println(numbers.sortedArray().contentToString())
}
fun takesInNam(tag1:String,tag2:String,tag3:String):String{
    var identity = arrayOf(tag1,tag2,tag3)
    return identity.contentToString()
}
fun square(numb1:Int,numb2:Int,numb3:Int){
    var sqr = arrayOf(numb1*numb1,numb2*numb2,numb3*numb3)
    println(sqr.contentToString())

}
fun number(){
    var num = arrayOf(3,5,6,7)
    for (nm in num){
        println(nm.toDouble().pow(2))
    }
}

