// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1977 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1977() {}
    static final FunctionDescriptor gtk_ui_manager_get_ui$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_ui_manager_get_ui$MH = RuntimeHelper.downcallHandle(
        "gtk_ui_manager_get_ui",
        constants$1977.gtk_ui_manager_get_ui$FUNC
    );
    static final FunctionDescriptor gtk_ui_manager_ensure_update$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_ui_manager_ensure_update$MH = RuntimeHelper.downcallHandle(
        "gtk_ui_manager_ensure_update",
        constants$1977.gtk_ui_manager_ensure_update$FUNC
    );
    static final FunctionDescriptor gtk_ui_manager_new_merge_id$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_ui_manager_new_merge_id$MH = RuntimeHelper.downcallHandle(
        "gtk_ui_manager_new_merge_id",
        constants$1977.gtk_ui_manager_new_merge_id$FUNC
    );
    static final FunctionDescriptor gtk_vbutton_box_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_vbutton_box_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_vbutton_box_get_type",
        constants$1977.gtk_vbutton_box_get_type$FUNC
    );
    static final FunctionDescriptor gtk_vbutton_box_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_vbutton_box_new$MH = RuntimeHelper.downcallHandle(
        "gtk_vbutton_box_new",
        constants$1977.gtk_vbutton_box_new$FUNC
    );
    static final FunctionDescriptor gtk_vbox_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_vbox_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_vbox_get_type",
        constants$1977.gtk_vbox_get_type$FUNC
    );
}


