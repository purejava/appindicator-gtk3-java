// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1798 {

    static final FunctionDescriptor gtk_gesture_ungroup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_gesture_ungroup$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_ungroup",
        constants$1798.gtk_gesture_ungroup$FUNC
    );
    static final FunctionDescriptor gtk_gesture_get_group$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_gesture_get_group$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_get_group",
        constants$1798.gtk_gesture_get_group$FUNC
    );
    static final FunctionDescriptor gtk_gesture_is_grouped_with$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_gesture_is_grouped_with$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_is_grouped_with",
        constants$1798.gtk_gesture_is_grouped_with$FUNC
    );
    static final FunctionDescriptor gtk_gesture_single_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_gesture_single_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_single_get_type",
        constants$1798.gtk_gesture_single_get_type$FUNC
    );
    static final FunctionDescriptor gtk_gesture_single_get_touch_only$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_gesture_single_get_touch_only$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_single_get_touch_only",
        constants$1798.gtk_gesture_single_get_touch_only$FUNC
    );
    static final FunctionDescriptor gtk_gesture_single_set_touch_only$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_gesture_single_set_touch_only$MH = RuntimeHelper.downcallHandle(
        "gtk_gesture_single_set_touch_only",
        constants$1798.gtk_gesture_single_set_touch_only$FUNC
    );
}

