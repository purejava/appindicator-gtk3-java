// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2011 {

    static final FunctionDescriptor gtk_stack_get_transition_running$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stack_get_transition_running$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_get_transition_running",
        constants$2011.gtk_stack_get_transition_running$FUNC
    );
    static final FunctionDescriptor gtk_stack_set_interpolate_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_stack_set_interpolate_size$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_set_interpolate_size",
        constants$2011.gtk_stack_set_interpolate_size$FUNC
    );
    static final FunctionDescriptor gtk_stack_get_interpolate_size$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stack_get_interpolate_size$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_get_interpolate_size",
        constants$2011.gtk_stack_get_interpolate_size$FUNC
    );
    static final FunctionDescriptor gtk_stack_sidebar_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_stack_sidebar_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_sidebar_get_type",
        constants$2011.gtk_stack_sidebar_get_type$FUNC
    );
    static final FunctionDescriptor gtk_stack_sidebar_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_stack_sidebar_new$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_sidebar_new",
        constants$2011.gtk_stack_sidebar_new$FUNC
    );
    static final FunctionDescriptor gtk_stack_sidebar_set_stack$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stack_sidebar_set_stack$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_sidebar_set_stack",
        constants$2011.gtk_stack_sidebar_set_stack$FUNC
    );
}


