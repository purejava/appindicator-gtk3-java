// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1138 {

    static final FunctionDescriptor tempnam$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle tempnam$MH = RuntimeHelper.downcallHandle(
        "tempnam",
        constants$1138.tempnam$FUNC
    );
    static final FunctionDescriptor fflush$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fflush$MH = RuntimeHelper.downcallHandle(
        "fflush",
        constants$1138.fflush$FUNC
    );
    static final FunctionDescriptor fflush_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fflush_unlocked$MH = RuntimeHelper.downcallHandle(
        "fflush_unlocked",
        constants$1138.fflush_unlocked$FUNC
    );
    static final FunctionDescriptor fopen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fopen$MH = RuntimeHelper.downcallHandle(
        "fopen",
        constants$1138.fopen$FUNC
    );
    static final FunctionDescriptor freopen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle freopen$MH = RuntimeHelper.downcallHandle(
        "freopen",
        constants$1138.freopen$FUNC
    );
    static final FunctionDescriptor fdopen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fdopen$MH = RuntimeHelper.downcallHandle(
        "fdopen",
        constants$1138.fdopen$FUNC
    );
}


