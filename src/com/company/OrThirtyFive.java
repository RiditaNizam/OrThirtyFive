package com.company;

/**
 * Created by ridita on 2/11/17.
 */
public class OrThirtyFive {

    public boolean or35(int n) {
        if ((n % 3 == 0) || (n % 5 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
