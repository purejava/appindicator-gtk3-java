// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$0 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$0() {}
    static final FunctionDescriptor clock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle clock$MH = RuntimeHelper.downcallHandle(
        "clock",
        constants$0.clock$FUNC
    );
    static final FunctionDescriptor time$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle time$MH = RuntimeHelper.downcallHandle(
        "time",
        constants$0.time$FUNC
    );
    static final FunctionDescriptor difftime$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle difftime$MH = RuntimeHelper.downcallHandle(
        "difftime",
        constants$0.difftime$FUNC
    );
    static final FunctionDescriptor mktime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mktime$MH = RuntimeHelper.downcallHandle(
        "mktime",
        constants$0.mktime$FUNC
    );
    static final FunctionDescriptor strftime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strftime$MH = RuntimeHelper.downcallHandle(
        "strftime",
        constants$0.strftime$FUNC
    );
    static final FunctionDescriptor strftime_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strftime_l$MH = RuntimeHelper.downcallHandle(
        "strftime_l",
        constants$0.strftime_l$FUNC
    );
}


