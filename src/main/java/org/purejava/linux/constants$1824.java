// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1824 {

    static final FunctionDescriptor gtk_style_properties_unset_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_style_properties_unset_property$MH = RuntimeHelper.downcallHandle(
        "gtk_style_properties_unset_property",
        constants$1824.gtk_style_properties_unset_property$FUNC
    );
    static final FunctionDescriptor gtk_style_properties_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_properties_clear$MH = RuntimeHelper.downcallHandle(
        "gtk_style_properties_clear",
        constants$1824.gtk_style_properties_clear$FUNC
    );
    static final FunctionDescriptor gtk_style_properties_merge$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_style_properties_merge$MH = RuntimeHelper.downcallHandle(
        "gtk_style_properties_merge",
        constants$1824.gtk_style_properties_merge$FUNC
    );
    static final FunctionDescriptor gtk_style_provider_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_style_provider_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_style_provider_get_type",
        constants$1824.gtk_style_provider_get_type$FUNC
    );
    static final FunctionDescriptor gtk_style_provider_get_style$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_provider_get_style$MH = RuntimeHelper.downcallHandle(
        "gtk_style_provider_get_style",
        constants$1824.gtk_style_provider_get_style$FUNC
    );
    static final FunctionDescriptor gtk_style_provider_get_style_property$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_provider_get_style_property$MH = RuntimeHelper.downcallHandle(
        "gtk_style_provider_get_style_property",
        constants$1824.gtk_style_provider_get_style_property$FUNC
    );
}

