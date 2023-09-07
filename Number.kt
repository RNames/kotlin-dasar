fun main() {

    //unsigned integer types
        //UByte: an unsigned 8-bit integer, ranges from 0 to 255
            val ubyte: UByte = 100U
        //UShort: an unsigned 16-bit integer, ranges from 0 to 65535
            val ushort: UShort = 10_000U
        //UInt: an unsigned 32-bit integer, ranges from 0 to 2^32 - 1
            val uint: UInt = 123456U
        //ULong: an unsigned 64-bit integer, ranges from 0 to 2^64 - 1
            val ulong: ULong = 1_000_000_000U

    val all = 1000U //UInt: no expected type provided, constant fits in UInt

    //underscore in number
    val age: Byte = 3_0
    val height: Int = 1_7_0
    val distance: Short = 30_000
    val balance: Long = 100_000_000L //variabel Long harus diberikan huruf F di akhir angkanya

    //floating point number
    val value: Float = 93.19F //variabel Float harus diberikan huruf F di akhir angkanya
    val radius: Double = 1933213.31982

    //literals
    val decimalLiteral: Int = 100
    val hexadecimalLiteral: Int = 0xFF // untuk membaca hexadecimal
    val binaryLiteral: Int = 0b0001 // untuk membaca binary

    //coversion
    val number: Int = 1_000_000

    val byte: Byte = distance.toByte()
    val double: Double = number.toDouble()

    println("Unsigned")
    println(ubyte)
    println(ushort)
    println(uint)
    println(ulong)
    println(all)
    println("Integer")
    println(age)
    println(height)
    println(distance)
    println(balance)
    println("Floating Point Numbers")
    println(value)
    println(radius)
    println("Literals")
    println(decimalLiteral)
    println(hexadecimalLiteral)
    println(binaryLiteral)
    println("Conversion")
    println(byte)
    println(double)

}
