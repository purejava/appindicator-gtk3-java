// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1158 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1158() {}
    static final FunctionDescriptor gdk_cursor_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cursor_unref$MH = RuntimeHelper.downcallHandle(
        "gdk_cursor_unref",
        constants$1158.gdk_cursor_unref$FUNC
    );
    static final FunctionDescriptor gdk_cursor_get_image$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cursor_get_image$MH = RuntimeHelper.downcallHandle(
        "gdk_cursor_get_image",
        constants$1158.gdk_cursor_get_image$FUNC
    );
    static final FunctionDescriptor gdk_cursor_get_surface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cursor_get_surface$MH = RuntimeHelper.downcallHandle(
        "gdk_cursor_get_surface",
        constants$1158.gdk_cursor_get_surface$FUNC
    );
    static final FunctionDescriptor gdk_cursor_get_cursor_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cursor_get_cursor_type$MH = RuntimeHelper.downcallHandle(
        "gdk_cursor_get_cursor_type",
        constants$1158.gdk_cursor_get_cursor_type$FUNC
    );
    static final FunctionDescriptor gdk_device_pad_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_device_pad_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_device_pad_get_type",
        constants$1158.gdk_device_pad_get_type$FUNC
    );
    static final FunctionDescriptor gdk_device_pad_get_n_groups$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_pad_get_n_groups$MH = RuntimeHelper.downcallHandle(
        "gdk_device_pad_get_n_groups",
        constants$1158.gdk_device_pad_get_n_groups$FUNC
    );
}


