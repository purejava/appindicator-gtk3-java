// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1304 {

    static final FunctionDescriptor gdk_pixbuf_format_is_scalable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_format_is_scalable$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_format_is_scalable",
        constants$1304.gdk_pixbuf_format_is_scalable$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_format_is_disabled$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_format_is_disabled$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_format_is_disabled",
        constants$1304.gdk_pixbuf_format_is_disabled$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_format_set_disabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_format_set_disabled$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_format_set_disabled",
        constants$1304.gdk_pixbuf_format_set_disabled$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_format_get_license$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_format_get_license$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_format_get_license",
        constants$1304.gdk_pixbuf_format_get_license$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_get_file_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_get_file_info$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_get_file_info",
        constants$1304.gdk_pixbuf_get_file_info$FUNC
    );
    static final FunctionDescriptor gdk_pixbuf_get_file_info_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_get_file_info_async$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_get_file_info_async",
        constants$1304.gdk_pixbuf_get_file_info_async$FUNC
    );
}


