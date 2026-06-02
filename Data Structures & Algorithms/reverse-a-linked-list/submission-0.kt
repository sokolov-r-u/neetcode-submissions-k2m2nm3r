/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
fun reverseList(head: ListNode?): ListNode? {
    var current = head ?: return null
    var prev: ListNode? = null
    var last = current.next
    while (last != null) {
        current.next = prev
        prev = current
        current = last
        last = current.next
    }
    current.next = prev
    return current
}
}
