// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1569 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1569() {}
    static final FunctionDescriptor gtk_file_filter_filter$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_filter_filter$MH = RuntimeHelper.downcallHandle(
        "gtk_file_filter_filter",
        constants$1569.gtk_file_filter_filter$FUNC
    );
    static final FunctionDescriptor gtk_file_filter_to_gvariant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_filter_to_gvariant$MH = RuntimeHelper.downcallHandle(
        "gtk_file_filter_to_gvariant",
        constants$1569.gtk_file_filter_to_gvariant$FUNC
    );
    static final FunctionDescriptor gtk_file_filter_new_from_gvariant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_filter_new_from_gvariant$MH = RuntimeHelper.downcallHandle(
        "gtk_file_filter_new_from_gvariant",
        constants$1569.gtk_file_filter_new_from_gvariant$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_file_chooser_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_type",
        constants$1569.gtk_file_chooser_get_type$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gtk_file_chooser_error_quark$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_error_quark",
        constants$1569.gtk_file_chooser_error_quark$FUNC
    );
    static final FunctionDescriptor gtk_file_chooser_set_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_set_action$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_set_action",
        constants$1569.gtk_file_chooser_set_action$FUNC
    );
}

