// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1832 {

    static final FunctionDescriptor gtk_style_context_set_junction_sides$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_style_context_set_junction_sides$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_set_junction_sides",
        constants$1832.gtk_style_context_set_junction_sides$FUNC
    );
    static final FunctionDescriptor gtk_style_context_get_junction_sides$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_get_junction_sides$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_get_junction_sides",
        constants$1832.gtk_style_context_get_junction_sides$FUNC
    );
    static final FunctionDescriptor gtk_style_context_lookup_color$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_lookup_color$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_lookup_color",
        constants$1832.gtk_style_context_lookup_color$FUNC
    );
    static final FunctionDescriptor gtk_style_context_notify_state_change$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_style_context_notify_state_change$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_notify_state_change",
        constants$1832.gtk_style_context_notify_state_change$FUNC
    );
    static final FunctionDescriptor gtk_style_context_cancel_animations$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_cancel_animations$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_cancel_animations",
        constants$1832.gtk_style_context_cancel_animations$FUNC
    );
    static final FunctionDescriptor gtk_style_context_scroll_animations$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_style_context_scroll_animations$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_scroll_animations",
        constants$1832.gtk_style_context_scroll_animations$FUNC
    );
}


