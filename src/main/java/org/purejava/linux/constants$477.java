// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$477 {

    static final FunctionDescriptor GToggleNotify$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle GToggleNotify$MH = RuntimeHelper.downcallHandle(
        constants$477.GToggleNotify$FUNC
    );
    static final FunctionDescriptor g_object_add_toggle_ref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_add_toggle_ref$MH = RuntimeHelper.downcallHandle(
        "g_object_add_toggle_ref",
        constants$477.g_object_add_toggle_ref$FUNC
    );
    static final FunctionDescriptor g_object_remove_toggle_ref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_remove_toggle_ref$MH = RuntimeHelper.downcallHandle(
        "g_object_remove_toggle_ref",
        constants$477.g_object_remove_toggle_ref$FUNC
    );
    static final FunctionDescriptor g_object_get_qdata$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_object_get_qdata$MH = RuntimeHelper.downcallHandle(
        "g_object_get_qdata",
        constants$477.g_object_get_qdata$FUNC
    );
    static final FunctionDescriptor g_object_set_qdata$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_set_qdata$MH = RuntimeHelper.downcallHandle(
        "g_object_set_qdata",
        constants$477.g_object_set_qdata$FUNC
    );
}

