// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$981 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$981() {}
    static final FunctionDescriptor printf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle printf$MH = RuntimeHelper.downcallHandleVariadic(
        "printf",
        constants$981.printf$FUNC
    );
    static final FunctionDescriptor sprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sprintf$MH = RuntimeHelper.downcallHandleVariadic(
        "sprintf",
        constants$981.sprintf$FUNC
    );
    static final FunctionDescriptor vfprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vfprintf$MH = RuntimeHelper.downcallHandle(
        "vfprintf",
        constants$981.vfprintf$FUNC
    );
    static final FunctionDescriptor vprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vprintf$MH = RuntimeHelper.downcallHandle(
        "vprintf",
        constants$981.vprintf$FUNC
    );
    static final FunctionDescriptor vsprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vsprintf$MH = RuntimeHelper.downcallHandle(
        "vsprintf",
        constants$981.vsprintf$FUNC
    );
    static final FunctionDescriptor snprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle snprintf$MH = RuntimeHelper.downcallHandleVariadic(
        "snprintf",
        constants$981.snprintf$FUNC
    );
}


