// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2171 {

    static final FunctionDescriptor gtk_theming_engine_load$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_theming_engine_load$MH = RuntimeHelper.downcallHandle(
        "gtk_theming_engine_load",
        constants$2171.gtk_theming_engine_load$FUNC
    );
    static final FunctionDescriptor gtk_theming_engine_get_screen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_theming_engine_get_screen$MH = RuntimeHelper.downcallHandle(
        "gtk_theming_engine_get_screen",
        constants$2171.gtk_theming_engine_get_screen$FUNC
    );
    static final FunctionDescriptor gtk_ui_manager_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_ui_manager_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_ui_manager_get_type",
        constants$2171.gtk_ui_manager_get_type$FUNC
    );
    static final FunctionDescriptor gtk_ui_manager_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_ui_manager_new$MH = RuntimeHelper.downcallHandle(
        "gtk_ui_manager_new",
        constants$2171.gtk_ui_manager_new$FUNC
    );
    static final FunctionDescriptor gtk_ui_manager_set_add_tearoffs$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_ui_manager_set_add_tearoffs$MH = RuntimeHelper.downcallHandle(
        "gtk_ui_manager_set_add_tearoffs",
        constants$2171.gtk_ui_manager_set_add_tearoffs$FUNC
    );
    static final FunctionDescriptor gtk_ui_manager_get_add_tearoffs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_ui_manager_get_add_tearoffs$MH = RuntimeHelper.downcallHandle(
        "gtk_ui_manager_get_add_tearoffs",
        constants$2171.gtk_ui_manager_get_add_tearoffs$FUNC
    );
}


