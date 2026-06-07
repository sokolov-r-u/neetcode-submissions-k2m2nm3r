/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
        if (head == null) return
        var middle = splitListAndReturnSecondHead(head)
        middle = reverse(middle)
        shuffle(head, middle)
    }
}

fun splitListAndReturnSecondHead(head: ListNode?): ListNode {
    var slow = head
    var fast = head
    while (fast != null) {
        fast = fast.next?.next
        if (fast == null) break
        slow = slow!!.next
    }
    return slow!!
}

    fun reverse(head: ListNode): ListNode {
    var prev: ListNode
    var curr = head
    var next = curr.next
    while (next != null) {
        prev = curr
        curr = next
        next = curr.next

        curr.next = prev
    }
    head.next = null
    return curr
}

fun shuffle(head: ListNode?, middle: ListNode?) {
    var curr = head
    var prev: ListNode
    var curr2 = middle
    var prev2: ListNode
    while (curr != null) {
        prev = curr
        curr = curr.next
        prev2 = curr2!!
        curr2 = curr2.next

        prev.next = prev2
        prev2.next = curr
    }
}
