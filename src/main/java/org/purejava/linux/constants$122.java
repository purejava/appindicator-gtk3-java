// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$122 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$122() {}
    static final FunctionDescriptor scandir$__cmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor scandir$__cmp_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scandir$__cmp_UP$MH = RuntimeHelper.upcallHandle(scandir$__cmp.class, "apply", constants$122.scandir$__cmp_UP$FUNC);
    static final FunctionDescriptor scandir$__cmp_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scandir$__cmp_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$122.scandir$__cmp_DOWN$FUNC
    );
    static final FunctionDescriptor scandir$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scandir$MH = RuntimeHelper.downcallHandle(
        "scandir",
        constants$122.scandir$FUNC
    );
    static final FunctionDescriptor alphasort$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle alphasort$MH = RuntimeHelper.downcallHandle(
        "alphasort",
        constants$122.alphasort$FUNC
    );
    static final FunctionDescriptor getdirentries$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getdirentries$MH = RuntimeHelper.downcallHandle(
        "getdirentries",
        constants$122.getdirentries$FUNC
    );
    static final FunctionDescriptor g_dir_open$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dir_open$MH = RuntimeHelper.downcallHandle(
        "g_dir_open",
        constants$122.g_dir_open$FUNC
    );
}


