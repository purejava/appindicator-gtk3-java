// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1777 {

    static final FunctionDescriptor gtk_native_dialog_set_transient_for$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_dialog_set_transient_for$MH = RuntimeHelper.downcallHandle(
        "gtk_native_dialog_set_transient_for",
        constants$1777.gtk_native_dialog_set_transient_for$FUNC
    );
    static final FunctionDescriptor gtk_native_dialog_get_transient_for$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_dialog_get_transient_for$MH = RuntimeHelper.downcallHandle(
        "gtk_native_dialog_get_transient_for",
        constants$1777.gtk_native_dialog_get_transient_for$FUNC
    );
    static final FunctionDescriptor gtk_native_dialog_run$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_dialog_run$MH = RuntimeHelper.downcallHandle(
        "gtk_native_dialog_run",
        constants$1777.gtk_native_dialog_run$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_native_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_file_chooser_native_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_native_get_type",
        constants$1777.gtk_file_chooser_native_get_type$FUNC
    );
    static final FunctionDescriptor glib_autoptr_clear_GtkFileChooserNative$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_clear_GtkFileChooserNative$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_clear_GtkFileChooserNative",
        constants$1777.glib_autoptr_clear_GtkFileChooserNative$FUNC
    );
    static final FunctionDescriptor glib_autoptr_cleanup_GtkFileChooserNative$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_cleanup_GtkFileChooserNative$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_cleanup_GtkFileChooserNative",
        constants$1777.glib_autoptr_cleanup_GtkFileChooserNative$FUNC
    );
}


