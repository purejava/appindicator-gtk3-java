// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$121 {

    static final FunctionDescriptor scandir$__selector$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scandir$__selector$MH = RuntimeHelper.downcallHandle(
        constants$121.scandir$__selector$FUNC
    );
    static final FunctionDescriptor scandir$__cmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scandir$__cmp$MH = RuntimeHelper.downcallHandle(
        constants$121.scandir$__cmp$FUNC
    );
    static final FunctionDescriptor scandir$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scandir$MH = RuntimeHelper.downcallHandle(
        "scandir",
        constants$121.scandir$FUNC
    );
    static final FunctionDescriptor alphasort$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle alphasort$MH = RuntimeHelper.downcallHandle(
        "alphasort",
        constants$121.alphasort$FUNC
    );
}


