package Problem3;

import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        // homework
        if (list != null && list.next != null) {
            printListInReverse(list.next, print);
        }
        if (list != null)
            print.println(list.val);
    }
}
