// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1493 {

    static final FunctionDescriptor gtk_window_add_mnemonic$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_add_mnemonic$MH = RuntimeHelper.downcallHandle(
        "gtk_window_add_mnemonic",
        constants$1493.gtk_window_add_mnemonic$FUNC
    );
    static final FunctionDescriptor gtk_window_remove_mnemonic$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_remove_mnemonic$MH = RuntimeHelper.downcallHandle(
        "gtk_window_remove_mnemonic",
        constants$1493.gtk_window_remove_mnemonic$FUNC
    );
    static final FunctionDescriptor gtk_window_mnemonic_activate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_mnemonic_activate$MH = RuntimeHelper.downcallHandle(
        "gtk_window_mnemonic_activate",
        constants$1493.gtk_window_mnemonic_activate$FUNC
    );
    static final FunctionDescriptor gtk_window_set_mnemonic_modifier$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_set_mnemonic_modifier$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_mnemonic_modifier",
        constants$1493.gtk_window_set_mnemonic_modifier$FUNC
    );
    static final FunctionDescriptor gtk_window_get_mnemonic_modifier$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_mnemonic_modifier$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_mnemonic_modifier",
        constants$1493.gtk_window_get_mnemonic_modifier$FUNC
    );
    static final FunctionDescriptor gtk_window_activate_key$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_activate_key$MH = RuntimeHelper.downcallHandle(
        "gtk_window_activate_key",
        constants$1493.gtk_window_activate_key$FUNC
    );
}

