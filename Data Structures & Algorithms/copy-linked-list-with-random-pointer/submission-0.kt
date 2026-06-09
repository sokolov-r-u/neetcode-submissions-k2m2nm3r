/*
// Definition for a Node.
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
*/

class Solution {
    fun copyRandomList(head: Node?): Node? {
        if (head == null) return head
        val map = mutableMapOf<Node?, Node?>()
        var curr = head
        while (curr != null) {
            val cloneNext = cloneOrGet(curr.next, map)
            val cloneRandom = cloneOrGet(curr.random, map)
            val cloneCurr = cloneOrGet(curr, map)
            cloneCurr?.next = cloneNext
            cloneCurr?.random = cloneRandom

            curr = curr.next
        }
        return map[head]
    }

    fun cloneOrGet(node: Node?, map: MutableMap<Node?, Node?>): Node? {
        if (node == null) return null
        return map.getOrPut(node) { Node(node.`val`) }
    }
}
