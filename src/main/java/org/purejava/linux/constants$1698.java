// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1698 {

    static final FunctionDescriptor gtk_builder_extend_with_template$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_extend_with_template$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_extend_with_template",
        constants$1698.gtk_builder_extend_with_template$FUNC
    );
    static final FunctionDescriptor gtk_buildable_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_buildable_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_buildable_get_type",
        constants$1698.gtk_buildable_get_type$FUNC
    );
    static final FunctionDescriptor gtk_buildable_set_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_buildable_set_name$MH = RuntimeHelper.downcallHandle(
        "gtk_buildable_set_name",
        constants$1698.gtk_buildable_set_name$FUNC
    );
    static final FunctionDescriptor gtk_buildable_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_buildable_get_name$MH = RuntimeHelper.downcallHandle(
        "gtk_buildable_get_name",
        constants$1698.gtk_buildable_get_name$FUNC
    );
    static final FunctionDescriptor gtk_buildable_add_child$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_buildable_add_child$MH = RuntimeHelper.downcallHandle(
        "gtk_buildable_add_child",
        constants$1698.gtk_buildable_add_child$FUNC
    );
    static final FunctionDescriptor gtk_buildable_set_buildable_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_buildable_set_buildable_property$MH = RuntimeHelper.downcallHandle(
        "gtk_buildable_set_buildable_property",
        constants$1698.gtk_buildable_set_buildable_property$FUNC
    );
}

