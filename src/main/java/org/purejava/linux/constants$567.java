// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$567 {

    static final FunctionDescriptor pipe$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pipe$MH = RuntimeHelper.downcallHandle(
        "pipe",
        constants$567.pipe$FUNC
    );
    static final FunctionDescriptor alarm$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle alarm$MH = RuntimeHelper.downcallHandle(
        "alarm",
        constants$567.alarm$FUNC
    );
    static final FunctionDescriptor sleep$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sleep$MH = RuntimeHelper.downcallHandle(
        "sleep",
        constants$567.sleep$FUNC
    );
    static final FunctionDescriptor ualarm$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle ualarm$MH = RuntimeHelper.downcallHandle(
        "ualarm",
        constants$567.ualarm$FUNC
    );
    static final FunctionDescriptor usleep$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle usleep$MH = RuntimeHelper.downcallHandle(
        "usleep",
        constants$567.usleep$FUNC
    );
    static final FunctionDescriptor pause$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle pause$MH = RuntimeHelper.downcallHandle(
        "pause",
        constants$567.pause$FUNC
    );
}


