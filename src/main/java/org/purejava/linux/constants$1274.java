// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1274 {

    static final FunctionDescriptor gdk_display_open_default_libgtk_only$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_display_open_default_libgtk_only$MH = RuntimeHelper.downcallHandle(
        "gdk_display_open_default_libgtk_only",
        constants$1274.gdk_display_open_default_libgtk_only$FUNC
    );
    static final FunctionDescriptor gdk_display_supports_cursor_alpha$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_supports_cursor_alpha$MH = RuntimeHelper.downcallHandle(
        "gdk_display_supports_cursor_alpha",
        constants$1274.gdk_display_supports_cursor_alpha$FUNC
    );
    static final FunctionDescriptor gdk_display_supports_cursor_color$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_supports_cursor_color$MH = RuntimeHelper.downcallHandle(
        "gdk_display_supports_cursor_color",
        constants$1274.gdk_display_supports_cursor_color$FUNC
    );
    static final FunctionDescriptor gdk_display_get_default_cursor_size$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_get_default_cursor_size$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_default_cursor_size",
        constants$1274.gdk_display_get_default_cursor_size$FUNC
    );
    static final FunctionDescriptor gdk_display_get_maximal_cursor_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_get_maximal_cursor_size$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_maximal_cursor_size",
        constants$1274.gdk_display_get_maximal_cursor_size$FUNC
    );
    static final FunctionDescriptor gdk_display_get_default_group$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_get_default_group$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_default_group",
        constants$1274.gdk_display_get_default_group$FUNC
    );
}

