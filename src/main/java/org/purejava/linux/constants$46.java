// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$46 {

    static final FunctionDescriptor setstate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle setstate$MH = RuntimeHelper.downcallHandle(
        "setstate",
        constants$46.setstate$FUNC
    );
    static final FunctionDescriptor random_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle random_r$MH = RuntimeHelper.downcallHandle(
        "random_r",
        constants$46.random_r$FUNC
    );
    static final FunctionDescriptor srandom_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle srandom_r$MH = RuntimeHelper.downcallHandle(
        "srandom_r",
        constants$46.srandom_r$FUNC
    );
    static final FunctionDescriptor initstate_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle initstate_r$MH = RuntimeHelper.downcallHandle(
        "initstate_r",
        constants$46.initstate_r$FUNC
    );
    static final FunctionDescriptor setstate_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle setstate_r$MH = RuntimeHelper.downcallHandle(
        "setstate_r",
        constants$46.setstate_r$FUNC
    );
    static final FunctionDescriptor rand$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle rand$MH = RuntimeHelper.downcallHandle(
        "rand",
        constants$46.rand$FUNC
    );
}


