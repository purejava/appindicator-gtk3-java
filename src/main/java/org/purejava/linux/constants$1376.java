// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1376 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1376() {}
    static final FunctionDescriptor gtk_cell_renderer_set_padding$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_cell_renderer_set_padding$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_renderer_set_padding",
        constants$1376.gtk_cell_renderer_set_padding$FUNC
    );
    static final FunctionDescriptor gtk_cell_renderer_get_padding$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_renderer_get_padding$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_renderer_get_padding",
        constants$1376.gtk_cell_renderer_get_padding$FUNC
    );
    static final FunctionDescriptor gtk_cell_renderer_set_visible$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_cell_renderer_set_visible$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_renderer_set_visible",
        constants$1376.gtk_cell_renderer_set_visible$FUNC
    );
    static final FunctionDescriptor gtk_cell_renderer_get_visible$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_renderer_get_visible$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_renderer_get_visible",
        constants$1376.gtk_cell_renderer_get_visible$FUNC
    );
    static final FunctionDescriptor gtk_cell_renderer_set_sensitive$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_cell_renderer_set_sensitive$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_renderer_set_sensitive",
        constants$1376.gtk_cell_renderer_set_sensitive$FUNC
    );
    static final FunctionDescriptor gtk_cell_renderer_get_sensitive$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_renderer_get_sensitive$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_renderer_get_sensitive",
        constants$1376.gtk_cell_renderer_get_sensitive$FUNC
    );
}


