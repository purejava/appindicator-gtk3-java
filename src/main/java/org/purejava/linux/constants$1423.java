// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1423 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1423() {}
    static final FunctionDescriptor gtk_targets_include_text$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_targets_include_text$MH = RuntimeHelper.downcallHandle(
        "gtk_targets_include_text",
        constants$1423.gtk_targets_include_text$FUNC
    );
    static final FunctionDescriptor gtk_targets_include_rich_text$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_targets_include_rich_text$MH = RuntimeHelper.downcallHandle(
        "gtk_targets_include_rich_text",
        constants$1423.gtk_targets_include_rich_text$FUNC
    );
    static final FunctionDescriptor gtk_targets_include_image$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_targets_include_image$MH = RuntimeHelper.downcallHandle(
        "gtk_targets_include_image",
        constants$1423.gtk_targets_include_image$FUNC
    );
    static final FunctionDescriptor gtk_targets_include_uri$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_targets_include_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_targets_include_uri",
        constants$1423.gtk_targets_include_uri$FUNC
    );
    static final FunctionDescriptor gtk_selection_data_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_selection_data_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_selection_data_get_type",
        constants$1423.gtk_selection_data_get_type$FUNC
    );
    static final FunctionDescriptor gtk_selection_data_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_selection_data_copy$MH = RuntimeHelper.downcallHandle(
        "gtk_selection_data_copy",
        constants$1423.gtk_selection_data_copy$FUNC
    );
}


