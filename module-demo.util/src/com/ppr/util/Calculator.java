package com.ppr.util;

import com.ppr.util.internal.AddHelper;

public class Calculator {
    public int add(int i, int j) {
        AddHelper helper = new AddHelper();
        return helper.add(i, j);
    }
}
