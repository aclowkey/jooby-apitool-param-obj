package com.mycompany;

import com.google.common.base.MoreObjects;

public class MyParams {
    String arg1;
    String arg2;
    String arg3;
    String arg4;
    String arg5;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("arg1", arg1)
                .add("arg2", arg2)
                .add("arg3", arg3)
                .add("arg4", arg4)
                .add("arg5", arg5)
                .toString();
    }
}
