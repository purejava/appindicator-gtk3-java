// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$122 {

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
    static final FunctionDescriptor g_dir_read_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dir_read_name$MH = RuntimeHelper.downcallHandle(
        "g_dir_read_name",
        constants$122.g_dir_read_name$FUNC
    );
    static final FunctionDescriptor g_dir_rewind$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dir_rewind$MH = RuntimeHelper.downcallHandle(
        "g_dir_rewind",
        constants$122.g_dir_rewind$FUNC
    );
    static final FunctionDescriptor g_dir_close$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dir_close$MH = RuntimeHelper.downcallHandle(
        "g_dir_close",
        constants$122.g_dir_close$FUNC
    );
    static final FunctionDescriptor g_getenv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_getenv$MH = RuntimeHelper.downcallHandle(
        "g_getenv",
        constants$122.g_getenv$FUNC
    );
}

