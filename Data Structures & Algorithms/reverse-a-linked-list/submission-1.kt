/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    //updated
fun reverseList(head: ListNode?): ListNode? {
    if (head == null) return head

    var prev: ListNode
    var curr = head
    var next = curr.next
    while (next != null) {
        prev = curr!!
        curr = next
        next = curr.next

        curr.next = prev
    }
    head.next = null
    return curr
}
}
