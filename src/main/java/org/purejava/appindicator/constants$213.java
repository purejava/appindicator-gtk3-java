// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$213 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$213() {}
    static final FunctionDescriptor g_io_channel_write$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_write$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_write",
        constants$213.g_io_channel_write$FUNC
    );
    static final FunctionDescriptor g_io_channel_seek$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_io_channel_seek$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_seek",
        constants$213.g_io_channel_seek$FUNC
    );
    static final FunctionDescriptor g_io_channel_close$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_close$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_close",
        constants$213.g_io_channel_close$FUNC
    );
    static final FunctionDescriptor g_io_channel_shutdown$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_shutdown$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_shutdown",
        constants$213.g_io_channel_shutdown$FUNC
    );
    static final FunctionDescriptor g_io_add_watch_full$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_add_watch_full$MH = RuntimeHelper.downcallHandle(
        "g_io_add_watch_full",
        constants$213.g_io_add_watch_full$FUNC
    );
    static final FunctionDescriptor g_io_create_watch$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_io_create_watch$MH = RuntimeHelper.downcallHandle(
        "g_io_create_watch",
        constants$213.g_io_create_watch$FUNC
    );
}


