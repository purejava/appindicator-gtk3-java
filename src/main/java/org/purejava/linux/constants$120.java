// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$120 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$120() {}
    static final FunctionDescriptor g_date_strftime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_strftime$MH = RuntimeHelper.downcallHandle(
        "g_date_strftime",
        constants$120.g_date_strftime$FUNC
    );
    static final FunctionDescriptor closedir$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle closedir$MH = RuntimeHelper.downcallHandle(
        "closedir",
        constants$120.closedir$FUNC
    );
    static final FunctionDescriptor opendir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle opendir$MH = RuntimeHelper.downcallHandle(
        "opendir",
        constants$120.opendir$FUNC
    );
    static final FunctionDescriptor fdopendir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fdopendir$MH = RuntimeHelper.downcallHandle(
        "fdopendir",
        constants$120.fdopendir$FUNC
    );
    static final FunctionDescriptor readdir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle readdir$MH = RuntimeHelper.downcallHandle(
        "readdir",
        constants$120.readdir$FUNC
    );
    static final FunctionDescriptor readdir_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle readdir_r$MH = RuntimeHelper.downcallHandle(
        "readdir_r",
        constants$120.readdir_r$FUNC
    );
}


