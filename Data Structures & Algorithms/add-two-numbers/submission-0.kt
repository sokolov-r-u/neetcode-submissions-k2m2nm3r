/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var curr1 = l1
        var curr2 = l2
        val dummy = ListNode(-1)
        var result = dummy 

        var remainder = 0
        while (curr1 != null || curr2 != null) {
            var sum = curr1.value() + curr2.value() + remainder
            remainder = sum / 10
            sum = sum % 10
            
            result.next = ListNode(sum)

            curr1 = curr1?.next
            curr2 = curr2?.next
            result = result.next!!
        }
        if (remainder > 0) {
            result.next = ListNode(1)
        }
        return dummy.next
    }
}

fun ListNode?.value(): Int = this?.`val` ?: 0


