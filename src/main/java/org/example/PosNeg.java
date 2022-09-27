package org.example;

public class PosNeg {
    boolean posNeg(int a, int b, boolean negative) {
        boolean retval=false;

        if (negative) {
            if ((a * b) < 0) {
            // one is positive and the other negative
                retval = false;
            }
            else {
            // either they're both positive or negative
                if (a < 0) {
            // both numbers are negative
                    retval = true;
                }
                else {
                    retval = false;
                }
            }
        }
        else {
            retval = ((a * b) < 0);
        }
        return false;
        }
}