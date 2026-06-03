/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var curr1 = list1
    var curr2 = list2

    val dummy = ListNode(-1)
    var result = dummy

    while (curr1 != null && curr2 != null) {
        if (curr1.`val` <= curr2.`val`) {
            result.next = curr1
            result = curr1
            curr1 = curr1.next
        } else {
            result.next = curr2
            result = curr2
            curr2 = curr2.next
        }
    }
    result.next = curr1?: curr2
    return dummy.next
}
}
