/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    // brute force
    fun reorderList(head: ListNode?): Unit {
        if (head == null) return
        var pnt = head
        var list = mutableListOf<ListNode>()
        while (pnt != null) {
            list.add(pnt)
            pnt = pnt.next
        }
        for (i in 0 until list.size / 2) {
           list[i].next = list[list.size - 1 - i]
           list[list.size - 1 - i].next = list[i+1]
        }
        list[list.size / 2].next = null
    }
}
