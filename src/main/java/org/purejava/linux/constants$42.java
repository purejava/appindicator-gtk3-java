// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$42 {

    static final FunctionDescriptor atoi$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atoi$MH = RuntimeHelper.downcallHandle(
        "atoi",
        constants$42.atoi$FUNC
    );
    static final FunctionDescriptor atol$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atol$MH = RuntimeHelper.downcallHandle(
        "atol",
        constants$42.atol$FUNC
    );
    static final FunctionDescriptor atoll$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atoll$MH = RuntimeHelper.downcallHandle(
        "atoll",
        constants$42.atoll$FUNC
    );
    static final FunctionDescriptor strtod$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strtod$MH = RuntimeHelper.downcallHandle(
        "strtod",
        constants$42.strtod$FUNC
    );
    static final FunctionDescriptor strtof$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strtof$MH = RuntimeHelper.downcallHandle(
        "strtof",
        constants$42.strtof$FUNC
    );
    static final FunctionDescriptor strtol$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strtol$MH = RuntimeHelper.downcallHandle(
        "strtol",
        constants$42.strtol$FUNC
    );
}

