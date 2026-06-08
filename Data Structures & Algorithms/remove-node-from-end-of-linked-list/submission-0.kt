/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    // two pointers
fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    if (head == null) return head
    val dummy = ListNode(-1)
    dummy.next = head
    var slow: ListNode? = dummy
    var fast: ListNode? = dummy

    repeat(n + 1) {
            fast = fast?.next
    }

    while (fast != null) {
        fast = fast.next
        slow = slow!!.next
    }

    slow?.next = slow.next?.next
    return dummy.next
}
}
