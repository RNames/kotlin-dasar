fun main() {
    val str = "First Of All 123"
    println(str.uppercase())
    println(str)

    val s = "First " + 1
    println(s + " Second 2")

//Kotlin has two types of string literals:
//
//Escaped strings
//Multiline strings

    //Escaped strings can contain escaped characters.

    val st = "This is Escaped String\n"
    print(st)

    //Multiline strings can contain newlines and arbitrary text.
    // It is delimited by a triple quote ("""), contains no escaping and can contain newlines and any other characters:

    val texts = """
    Hello string
    """

    val text = """
    |Aku Sayang
    |Kamu Juga Sayang
    |Tapi Sayang
    |Kita Berjauhan
    """.trimMargin()

    println(texts)
    println(text)

    //STRING TEMPLATES

    //String literals may contain template expressions – pieces of code that are evaluated
    // and whose results are concatenated into the string.
    // A template expression starts with a dollar sign ($) and consists of either a name:

    val i = 100
    println("i = $i")

    val j = "panjang"
    println("$j length is ${j.length}")

    val price = """
    This thing cost ${'$'}9.99
    """
    print("$price")
}