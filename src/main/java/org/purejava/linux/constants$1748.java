// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1748 {

    static final FunctionDescriptor gtk_drag_source_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_drag_source_set$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_set",
        constants$1748.gtk_drag_source_set$FUNC
    );
    static final FunctionDescriptor gtk_drag_source_unset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_source_unset$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_unset",
        constants$1748.gtk_drag_source_unset$FUNC
    );
    static final FunctionDescriptor gtk_drag_source_get_target_list$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_source_get_target_list$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_get_target_list",
        constants$1748.gtk_drag_source_get_target_list$FUNC
    );
    static final FunctionDescriptor gtk_drag_source_set_target_list$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_source_set_target_list$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_set_target_list",
        constants$1748.gtk_drag_source_set_target_list$FUNC
    );
    static final FunctionDescriptor gtk_drag_source_add_text_targets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_source_add_text_targets$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_add_text_targets",
        constants$1748.gtk_drag_source_add_text_targets$FUNC
    );
    static final FunctionDescriptor gtk_drag_source_add_image_targets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_source_add_image_targets$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_add_image_targets",
        constants$1748.gtk_drag_source_add_image_targets$FUNC
    );
}

