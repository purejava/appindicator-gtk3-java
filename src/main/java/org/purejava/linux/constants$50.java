// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$50 {

    static final FunctionDescriptor seed48_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle seed48_r$MH = RuntimeHelper.downcallHandle(
        "seed48_r",
        constants$50.seed48_r$FUNC
    );
    static final FunctionDescriptor lcong48_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lcong48_r$MH = RuntimeHelper.downcallHandle(
        "lcong48_r",
        constants$50.lcong48_r$FUNC
    );
    static final FunctionDescriptor malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle malloc$MH = RuntimeHelper.downcallHandle(
        "malloc",
        constants$50.malloc$FUNC
    );
    static final FunctionDescriptor calloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle calloc$MH = RuntimeHelper.downcallHandle(
        "calloc",
        constants$50.calloc$FUNC
    );
    static final FunctionDescriptor realloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle realloc$MH = RuntimeHelper.downcallHandle(
        "realloc",
        constants$50.realloc$FUNC
    );
    static final FunctionDescriptor free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle free$MH = RuntimeHelper.downcallHandle(
        "free",
        constants$50.free$FUNC
    );
}

