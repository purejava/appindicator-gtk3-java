// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2173 {

    static final FunctionDescriptor gtk_ui_manager_get_action$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_ui_manager_get_action$MH = RuntimeHelper.downcallHandle(
        "gtk_ui_manager_get_action",
        constants$2173.gtk_ui_manager_get_action$FUNC
    );
    static final FunctionDescriptor gtk_ui_manager_add_ui_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_ui_manager_add_ui_from_string$MH = RuntimeHelper.downcallHandle(
        "gtk_ui_manager_add_ui_from_string",
        constants$2173.gtk_ui_manager_add_ui_from_string$FUNC
    );
    static final FunctionDescriptor gtk_ui_manager_add_ui_from_file$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_ui_manager_add_ui_from_file$MH = RuntimeHelper.downcallHandle(
        "gtk_ui_manager_add_ui_from_file",
        constants$2173.gtk_ui_manager_add_ui_from_file$FUNC
    );
    static final FunctionDescriptor gtk_ui_manager_add_ui_from_resource$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_ui_manager_add_ui_from_resource$MH = RuntimeHelper.downcallHandle(
        "gtk_ui_manager_add_ui_from_resource",
        constants$2173.gtk_ui_manager_add_ui_from_resource$FUNC
    );
    static final FunctionDescriptor gtk_ui_manager_add_ui$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_ui_manager_add_ui$MH = RuntimeHelper.downcallHandle(
        "gtk_ui_manager_add_ui",
        constants$2173.gtk_ui_manager_add_ui$FUNC
    );
    static final FunctionDescriptor gtk_ui_manager_remove_ui$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_ui_manager_remove_ui$MH = RuntimeHelper.downcallHandle(
        "gtk_ui_manager_remove_ui",
        constants$2173.gtk_ui_manager_remove_ui$FUNC
    );
}


