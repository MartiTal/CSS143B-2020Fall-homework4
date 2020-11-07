package Problem2;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    public static ListNode findMidAndBreak(ListNode head) {
        // homework
        if (head != null && head.next != null)
            return findMidAndBreakHelper(head, head);
        return null;
    }

    private static ListNode findMidAndBreakHelper(ListNode p1, ListNode p2) {

        if (p2.next != null) {
            p2 = p2.next.next;
        } else {
            p2 = null;
        }

        if (p2 == null || p2.next == null) {
            ListNode temp;
            temp = p1.next;
            p1.next = null;
            return temp;
        }

        p1 = p1.next;

        return(findMidAndBreakHelper(p1, p2));

    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        // homework
        if (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                list1.next = mergeLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeLists(list1, list2.next);
                return list2;
            }

        }
        if (list1 != null) {
            list1.next = mergeLists(list1.next, list2);
            return list1;
        }
        if (list2 != null) {
            list2.next = mergeLists(list1, list2.next);
            return list2;
        }
        return null;
    }
}
