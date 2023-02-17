fun main () {
    val school="akirachix"
    println(school[0]+""+school[2]+""+school[3])
     val d=getparameters("Nakakande",23)
    println(d)
    getlength("Goodmorning")
    getlength("Things are good")
    getname("angel")


}
fun schoolname(school:String){
    val school="akirachix"
}

fun getparameters(x: String,y:Int):String {
    val x= "Hi my name is $x and Iam $y years old"
    return x
}

fun getlength(get:String) {
    println(get.length,)


}

fun getname(name: String) {
    if (name == "Bridget")
        println("That's  me")
        else
            println("I dont know  who that is")
        }

