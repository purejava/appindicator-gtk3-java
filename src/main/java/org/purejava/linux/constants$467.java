// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$467 {

    static final FunctionDescriptor GBoxedCopyFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBoxedCopyFunc$MH = RuntimeHelper.downcallHandle(
        constants$467.GBoxedCopyFunc$FUNC
    );
    static final FunctionDescriptor GBoxedFreeFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GBoxedFreeFunc$MH = RuntimeHelper.downcallHandle(
        constants$467.GBoxedFreeFunc$FUNC
    );
    static final FunctionDescriptor g_boxed_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_boxed_copy$MH = RuntimeHelper.downcallHandle(
        "g_boxed_copy",
        constants$467.g_boxed_copy$FUNC
    );
    static final FunctionDescriptor g_boxed_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_boxed_free$MH = RuntimeHelper.downcallHandle(
        "g_boxed_free",
        constants$467.g_boxed_free$FUNC
    );
}


