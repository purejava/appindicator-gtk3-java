// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$47 {

    static final FunctionDescriptor srand$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle srand$MH = RuntimeHelper.downcallHandle(
        "srand",
        constants$47.srand$FUNC
    );
    static final FunctionDescriptor rand_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rand_r$MH = RuntimeHelper.downcallHandle(
        "rand_r",
        constants$47.rand_r$FUNC
    );
    static final FunctionDescriptor drand48$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT);
    static final MethodHandle drand48$MH = RuntimeHelper.downcallHandle(
        "drand48",
        constants$47.drand48$FUNC
    );
    static final FunctionDescriptor erand48$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle erand48$MH = RuntimeHelper.downcallHandle(
        "erand48",
        constants$47.erand48$FUNC
    );
    static final FunctionDescriptor lrand48$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle lrand48$MH = RuntimeHelper.downcallHandle(
        "lrand48",
        constants$47.lrand48$FUNC
    );
    static final FunctionDescriptor nrand48$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle nrand48$MH = RuntimeHelper.downcallHandle(
        "nrand48",
        constants$47.nrand48$FUNC
    );
}


