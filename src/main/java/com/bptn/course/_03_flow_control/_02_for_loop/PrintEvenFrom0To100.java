package com.bptn.course._03_flow_control._02_for_loop;

public class PrintEvenFrom0To100 {
    public static void main(String[] args) {
        // Declare variable 'i' and initialize it to 2, the first even number
        int i = 2;
        
        // Start a loop where 'i' is incremented by 1 each time, with a condition to stop at 100
        for (i = 1; i <= 100; i++) {
            // Check if 'i' is an even number
            if (i % 2 == 0) {
                // If true, print 'i' as it is an even number
                System.out.println(i);
            }
        }
    }
}
