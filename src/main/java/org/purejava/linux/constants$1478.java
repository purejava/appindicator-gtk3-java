// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1478 {

    static final FunctionDescriptor gtk_container_forall$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_container_forall$MH = RuntimeHelper.downcallHandle(
        "gtk_container_forall",
        constants$1478.gtk_container_forall$FUNC
    );
    static final FunctionDescriptor gtk_container_class_handle_border_width$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_container_class_handle_border_width$MH = RuntimeHelper.downcallHandle(
        "gtk_container_class_handle_border_width",
        constants$1478.gtk_container_class_handle_border_width$FUNC
    );
    static final FunctionDescriptor gtk_container_get_path_for_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_container_get_path_for_child$MH = RuntimeHelper.downcallHandle(
        "gtk_container_get_path_for_child",
        constants$1478.gtk_container_get_path_for_child$FUNC
    );
    static final FunctionDescriptor glib_autoptr_clear_GtkContainer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_clear_GtkContainer$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_clear_GtkContainer",
        constants$1478.glib_autoptr_clear_GtkContainer$FUNC
    );
    static final FunctionDescriptor glib_autoptr_cleanup_GtkContainer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_cleanup_GtkContainer$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_cleanup_GtkContainer",
        constants$1478.glib_autoptr_cleanup_GtkContainer$FUNC
    );
    static final FunctionDescriptor glib_listautoptr_cleanup_GtkContainer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_listautoptr_cleanup_GtkContainer$MH = RuntimeHelper.downcallHandle(
        "glib_listautoptr_cleanup_GtkContainer",
        constants$1478.glib_listautoptr_cleanup_GtkContainer$FUNC
    );
}

