

fun String.count(c:Char):Int{
    var count = 0
    for (i in 0..this.length) {
        if (this[i] == c) count++
    }
    return count
}