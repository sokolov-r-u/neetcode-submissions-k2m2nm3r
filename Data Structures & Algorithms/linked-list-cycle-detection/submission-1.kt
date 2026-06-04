/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    // two pointers
fun hasCycle(head: ListNode?): Boolean {
    var fast = head ?: return false
    var slow = head
    while (true) {
        fast = fast.next?.next ?: return false
        if (fast == slow) return true
        slow = slow!!.next
    }
}
}