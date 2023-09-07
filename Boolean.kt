fun main() {
//    The type Boolean represents boolean objects that can have two values: true and false
//    Boolean has a nullable counterpart Boolean? that also has the null value.

//    || = disjunction (logical OR)

//    && = conjunction (logical AND)

//    ! = negation (logical NOT)

    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue||myFalse)
    println(myTrue&&myFalse)
    println(!myTrue)
    println(!myFalse)
}