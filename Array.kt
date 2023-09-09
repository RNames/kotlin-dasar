fun main() {
    val member: Array<String> = arrayOf("Daffa","Davin","Bambang")
    val umur : Array<Byte> = arrayOf(15,17,16)
    val balance : Array<Int> = arrayOf(10_000,30_000,50_000)

    var i : Int = 0
    while (i <= 2) {
        println(member[i] + " " + umur[i] + " " + balance[i])
    i++
    }

}