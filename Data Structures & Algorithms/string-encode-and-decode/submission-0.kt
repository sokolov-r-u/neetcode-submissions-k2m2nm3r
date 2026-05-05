class Solution {

fun encode(strs: List<String>): String {
    val buffer = StringBuilder();
    for (str in strs) {
        buffer.append("${str.length}#$str")
    }
    return buffer.toString()
}

fun decode(str: String): List<String> {
    val separator = "#"
    val strs = ArrayList<String>()

    var nextStrIdx = 0
    var separatorIndex = str.indexOf(separator, nextStrIdx)
    while (separatorIndex != -1) {
        val length = str.substring(nextStrIdx, separatorIndex).toInt()
        nextStrIdx = separatorIndex + 1 + length
        strs.add(str.substring(separatorIndex + 1, nextStrIdx))
        separatorIndex = str.indexOf(separator, nextStrIdx)
    }
    return strs
}
}
