/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    // brute force
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if(lists.isEmpty()) return null
        val dummy = ListNode(Int.MIN_VALUE)
        var cur: ListNode? = dummy
        while (arrayHasNonNull(lists)) {
            if (cur == null) break
            var minNode: ListNode? = ListNode(Int.MAX_VALUE)
            var nodeIndex = -1
            for (i in lists.indices) {
                lists[i]?: continue
                val node = lists[i]
                if (node.value() < minNode.value()) {
                    minNode = node
                    nodeIndex = i
                }
                if (cur.value() == node?.value()) {
                    break
                }
            }
                cur!!.next = minNode
                cur = cur?.next
                lists[nodeIndex]= minNode?.next
        }
            return dummy.next!!
    }

    fun ListNode?.value(): Int = this?.`val`?: Int.MAX_VALUE

    fun arrayHasNonNull(lists: Array<ListNode?>): Boolean {
        for (node in lists) {
            if (node != null) {
                return true
            }
        }
        return false
    }
}
