// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1180 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1180() {}
    static final FunctionDescriptor gdk_set_allowed_backends$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_set_allowed_backends$MH = RuntimeHelper.downcallHandle(
        "gdk_set_allowed_backends",
        constants$1180.gdk_set_allowed_backends$FUNC
    );
    static final FunctionDescriptor gdk_pango_context_get_for_screen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pango_context_get_for_screen$MH = RuntimeHelper.downcallHandle(
        "gdk_pango_context_get_for_screen",
        constants$1180.gdk_pango_context_get_for_screen$FUNC
    );
    static final FunctionDescriptor gdk_pango_context_get_for_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pango_context_get_for_display$MH = RuntimeHelper.downcallHandle(
        "gdk_pango_context_get_for_display",
        constants$1180.gdk_pango_context_get_for_display$FUNC
    );
    static final FunctionDescriptor gdk_pango_context_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_pango_context_get$MH = RuntimeHelper.downcallHandle(
        "gdk_pango_context_get",
        constants$1180.gdk_pango_context_get$FUNC
    );
    static final FunctionDescriptor gdk_pango_layout_line_get_clip_region$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_pango_layout_line_get_clip_region$MH = RuntimeHelper.downcallHandle(
        "gdk_pango_layout_line_get_clip_region",
        constants$1180.gdk_pango_layout_line_get_clip_region$FUNC
    );
    static final FunctionDescriptor gdk_pango_layout_get_clip_region$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_pango_layout_get_clip_region$MH = RuntimeHelper.downcallHandle(
        "gdk_pango_layout_get_clip_region",
        constants$1180.gdk_pango_layout_get_clip_region$FUNC
    );
}


