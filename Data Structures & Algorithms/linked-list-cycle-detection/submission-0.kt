/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
fun hasCycle(head: ListNode?): Boolean {
    var tmp = head?: return false
    val count = mutableSetOf<ListNode>()
    while(tmp.next != null)   {
        if (count.contains(tmp)) {
            return true
        }
        count.add(tmp)
        tmp = tmp.next!!
    }
    return count.contains(tmp)
}
}
