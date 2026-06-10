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

        var tmp: Node?
        var current = head

        while (current != null) {
            val copy = Node(current.`val`) 
            tmp = current.next
            current!!.next = copy
            copy!!.next = tmp
current = copy.next        }
        current = head

current = head
while (current != null) {
    current.next!!.random = current.random?.next
    current = current.next?.next
}
        

current = head
val dummy = Node(-1)
dummy.next = head.next
while (current != null) {
    val copy = current.next      // A'
    val next = copy?.next        // B
    copy?.next = next?.next      // A'.next = B'
    current.next = next          // A.next = B
    current = next               // переходим к B
}
return dummy.next
    }
}
