// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1823 {

    static final FunctionDescriptor gtk_style_properties_set_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_properties_set_property$MH = RuntimeHelper.downcallHandle(
        "gtk_style_properties_set_property",
        constants$1823.gtk_style_properties_set_property$FUNC
    );
    static final FunctionDescriptor gtk_style_properties_set_valist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_properties_set_valist$MH = RuntimeHelper.downcallHandle(
        "gtk_style_properties_set_valist",
        constants$1823.gtk_style_properties_set_valist$FUNC
    );
    static final FunctionDescriptor gtk_style_properties_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_style_properties_set$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_style_properties_set",
        constants$1823.gtk_style_properties_set$FUNC
    );
    static final FunctionDescriptor gtk_style_properties_get_property$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_properties_get_property$MH = RuntimeHelper.downcallHandle(
        "gtk_style_properties_get_property",
        constants$1823.gtk_style_properties_get_property$FUNC
    );
    static final FunctionDescriptor gtk_style_properties_get_valist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_properties_get_valist$MH = RuntimeHelper.downcallHandle(
        "gtk_style_properties_get_valist",
        constants$1823.gtk_style_properties_get_valist$FUNC
    );
    static final FunctionDescriptor gtk_style_properties_get$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_style_properties_get$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_style_properties_get",
        constants$1823.gtk_style_properties_get$FUNC
    );
}


