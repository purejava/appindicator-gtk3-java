// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1262 {

    static final FunctionDescriptor gdk_window_process_all_updates$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gdk_window_process_all_updates$MH = RuntimeHelper.downcallHandle(
        "gdk_window_process_all_updates",
        constants$1262.gdk_window_process_all_updates$FUNC
    );
    static final FunctionDescriptor gdk_window_process_updates$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_process_updates$MH = RuntimeHelper.downcallHandle(
        "gdk_window_process_updates",
        constants$1262.gdk_window_process_updates$FUNC
    );
    static final FunctionDescriptor gdk_window_set_debug_updates$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_set_debug_updates$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_debug_updates",
        constants$1262.gdk_window_set_debug_updates$FUNC
    );
    static final FunctionDescriptor gdk_window_constrain_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_constrain_size$MH = RuntimeHelper.downcallHandle(
        "gdk_window_constrain_size",
        constants$1262.gdk_window_constrain_size$FUNC
    );
    static final FunctionDescriptor gdk_window_enable_synchronized_configure$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_enable_synchronized_configure$MH = RuntimeHelper.downcallHandle(
        "gdk_window_enable_synchronized_configure",
        constants$1262.gdk_window_enable_synchronized_configure$FUNC
    );
    static final FunctionDescriptor gdk_window_configure_finished$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_configure_finished$MH = RuntimeHelper.downcallHandle(
        "gdk_window_configure_finished",
        constants$1262.gdk_window_configure_finished$FUNC
    );
}

