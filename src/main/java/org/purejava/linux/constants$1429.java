// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1429 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1429() {}
    static final FunctionDescriptor gtk_editable_delete_selection$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_delete_selection$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_delete_selection",
        constants$1429.gtk_editable_delete_selection$FUNC
    );
    static final FunctionDescriptor gtk_editable_set_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_editable_set_position$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_set_position",
        constants$1429.gtk_editable_set_position$FUNC
    );
    static final FunctionDescriptor gtk_editable_get_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_get_position$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_get_position",
        constants$1429.gtk_editable_get_position$FUNC
    );
    static final FunctionDescriptor gtk_editable_set_editable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_editable_set_editable$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_set_editable",
        constants$1429.gtk_editable_set_editable$FUNC
    );
    static final FunctionDescriptor gtk_editable_get_editable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_get_editable$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_get_editable",
        constants$1429.gtk_editable_get_editable$FUNC
    );
    static final FunctionDescriptor gtk_im_context_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_im_context_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_im_context_get_type",
        constants$1429.gtk_im_context_get_type$FUNC
    );
}


