// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4() {}
    static final FunctionDescriptor nanosleep$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle nanosleep$MH = RuntimeHelper.downcallHandle(
        "nanosleep",
        constants$4.nanosleep$FUNC
    );
    static final FunctionDescriptor clock_getres$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clock_getres$MH = RuntimeHelper.downcallHandle(
        "clock_getres",
        constants$4.clock_getres$FUNC
    );
    static final FunctionDescriptor clock_gettime$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clock_gettime$MH = RuntimeHelper.downcallHandle(
        "clock_gettime",
        constants$4.clock_gettime$FUNC
    );
    static final FunctionDescriptor clock_settime$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clock_settime$MH = RuntimeHelper.downcallHandle(
        "clock_settime",
        constants$4.clock_settime$FUNC
    );
    static final FunctionDescriptor clock_nanosleep$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clock_nanosleep$MH = RuntimeHelper.downcallHandle(
        "clock_nanosleep",
        constants$4.clock_nanosleep$FUNC
    );
    static final FunctionDescriptor clock_getcpuclockid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clock_getcpuclockid$MH = RuntimeHelper.downcallHandle(
        "clock_getcpuclockid",
        constants$4.clock_getcpuclockid$FUNC
    );
}


