// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1497 {

    static final FunctionDescriptor gtk_window_get_default_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_default_size$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_default_size",
        constants$1497.gtk_window_get_default_size$FUNC
    );
    static final FunctionDescriptor gtk_window_resize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_resize$MH = RuntimeHelper.downcallHandle(
        "gtk_window_resize",
        constants$1497.gtk_window_resize$FUNC
    );
    static final FunctionDescriptor gtk_window_get_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_size$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_size",
        constants$1497.gtk_window_get_size$FUNC
    );
    static final FunctionDescriptor gtk_window_move$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_move$MH = RuntimeHelper.downcallHandle(
        "gtk_window_move",
        constants$1497.gtk_window_move$FUNC
    );
    static final FunctionDescriptor gtk_window_get_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_position$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_position",
        constants$1497.gtk_window_get_position$FUNC
    );
    static final FunctionDescriptor gtk_window_parse_geometry$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_parse_geometry$MH = RuntimeHelper.downcallHandle(
        "gtk_window_parse_geometry",
        constants$1497.gtk_window_parse_geometry$FUNC
    );
}


