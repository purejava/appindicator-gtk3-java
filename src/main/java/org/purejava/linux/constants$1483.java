// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1483 {

    static final FunctionDescriptor gtk_window_set_default$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_set_default$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_default",
        constants$1483.gtk_window_set_default$FUNC
    );
    static final FunctionDescriptor gtk_window_get_default_widget$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_default_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_default_widget",
        constants$1483.gtk_window_get_default_widget$FUNC
    );
    static final FunctionDescriptor gtk_window_activate_default$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_activate_default$MH = RuntimeHelper.downcallHandle(
        "gtk_window_activate_default",
        constants$1483.gtk_window_activate_default$FUNC
    );
    static final FunctionDescriptor gtk_window_set_transient_for$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_set_transient_for$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_transient_for",
        constants$1483.gtk_window_set_transient_for$FUNC
    );
    static final FunctionDescriptor gtk_window_get_transient_for$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_transient_for$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_transient_for",
        constants$1483.gtk_window_get_transient_for$FUNC
    );
    static final FunctionDescriptor gtk_window_set_attached_to$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_set_attached_to$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_attached_to",
        constants$1483.gtk_window_set_attached_to$FUNC
    );
}

