// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1719 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1719() {}
    static final FunctionDescriptor gtk_pad_controller_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_pad_controller_new$MH = RuntimeHelper.downcallHandle(
        "gtk_pad_controller_new",
        constants$1719.gtk_pad_controller_new$FUNC
    );
    static final FunctionDescriptor gtk_pad_controller_set_action_entries$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_pad_controller_set_action_entries$MH = RuntimeHelper.downcallHandle(
        "gtk_pad_controller_set_action_entries",
        constants$1719.gtk_pad_controller_set_action_entries$FUNC
    );
    static final FunctionDescriptor gtk_pad_controller_set_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_pad_controller_set_action$MH = RuntimeHelper.downcallHandle(
        "gtk_pad_controller_set_action",
        constants$1719.gtk_pad_controller_set_action$FUNC
    );
    static final FunctionDescriptor gtk_paper_size_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_paper_size_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_paper_size_get_type",
        constants$1719.gtk_paper_size_get_type$FUNC
    );
    static final FunctionDescriptor gtk_paper_size_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_paper_size_new$MH = RuntimeHelper.downcallHandle(
        "gtk_paper_size_new",
        constants$1719.gtk_paper_size_new$FUNC
    );
    static final FunctionDescriptor gtk_paper_size_new_from_ppd$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_paper_size_new_from_ppd$MH = RuntimeHelper.downcallHandle(
        "gtk_paper_size_new_from_ppd",
        constants$1719.gtk_paper_size_new_from_ppd$FUNC
    );
}


