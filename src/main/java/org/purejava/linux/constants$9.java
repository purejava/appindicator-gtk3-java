// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$9 {

    static final FunctionDescriptor GTranslateFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTranslateFunc$MH = RuntimeHelper.downcallHandle(
        constants$9.GTranslateFunc$FUNC
    );
    static final FunctionDescriptor memcpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle memcpy$MH = RuntimeHelper.downcallHandle(
        "memcpy",
        constants$9.memcpy$FUNC
    );
    static final FunctionDescriptor memmove$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle memmove$MH = RuntimeHelper.downcallHandle(
        "memmove",
        constants$9.memmove$FUNC
    );
    static final FunctionDescriptor memccpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle memccpy$MH = RuntimeHelper.downcallHandle(
        "memccpy",
        constants$9.memccpy$FUNC
    );
    static final FunctionDescriptor memset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle memset$MH = RuntimeHelper.downcallHandle(
        "memset",
        constants$9.memset$FUNC
    );
}


