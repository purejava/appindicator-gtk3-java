// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$203 {

    static final FunctionDescriptor g_io_channel_set_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_set_flags$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_set_flags",
        constants$203.g_io_channel_set_flags$FUNC
    );
    static final FunctionDescriptor g_io_channel_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_get_flags",
        constants$203.g_io_channel_get_flags$FUNC
    );
    static final FunctionDescriptor g_io_channel_set_line_term$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_io_channel_set_line_term$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_set_line_term",
        constants$203.g_io_channel_set_line_term$FUNC
    );
    static final FunctionDescriptor g_io_channel_get_line_term$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_get_line_term$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_get_line_term",
        constants$203.g_io_channel_get_line_term$FUNC
    );
    static final FunctionDescriptor g_io_channel_set_buffered$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_io_channel_set_buffered$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_set_buffered",
        constants$203.g_io_channel_set_buffered$FUNC
    );
    static final FunctionDescriptor g_io_channel_get_buffered$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_get_buffered$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_get_buffered",
        constants$203.g_io_channel_get_buffered$FUNC
    );
}


