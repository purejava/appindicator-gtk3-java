// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$45 {

    static final FunctionDescriptor __uint64_identity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __uint64_identity$MH = RuntimeHelper.downcallHandle(
        "__uint64_identity",
        constants$45.__uint64_identity$FUNC
    );
    static final FunctionDescriptor select$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle select$MH = RuntimeHelper.downcallHandle(
        "select",
        constants$45.select$FUNC
    );
    static final FunctionDescriptor pselect$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pselect$MH = RuntimeHelper.downcallHandle(
        "pselect",
        constants$45.pselect$FUNC
    );
    static final FunctionDescriptor random$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle random$MH = RuntimeHelper.downcallHandle(
        "random",
        constants$45.random$FUNC
    );
    static final FunctionDescriptor srandom$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle srandom$MH = RuntimeHelper.downcallHandle(
        "srandom",
        constants$45.srandom$FUNC
    );
    static final FunctionDescriptor initstate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle initstate$MH = RuntimeHelper.downcallHandle(
        "initstate",
        constants$45.initstate$FUNC
    );
}

