// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1825 {

    static final FunctionDescriptor gtk_style_provider_get_icon_factory$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_provider_get_icon_factory$MH = RuntimeHelper.downcallHandle(
        "gtk_style_provider_get_icon_factory",
        constants$1825.gtk_style_provider_get_icon_factory$FUNC
    );
    static final FunctionDescriptor gtk_style_context_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_style_context_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_get_type",
        constants$1825.gtk_style_context_get_type$FUNC
    );
    static final FunctionDescriptor gtk_style_context_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_style_context_new$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_new",
        constants$1825.gtk_style_context_new$FUNC
    );
    static final FunctionDescriptor gtk_style_context_add_provider_for_screen$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_style_context_add_provider_for_screen$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_add_provider_for_screen",
        constants$1825.gtk_style_context_add_provider_for_screen$FUNC
    );
    static final FunctionDescriptor gtk_style_context_remove_provider_for_screen$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_context_remove_provider_for_screen$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_remove_provider_for_screen",
        constants$1825.gtk_style_context_remove_provider_for_screen$FUNC
    );
    static final FunctionDescriptor gtk_style_context_add_provider$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_style_context_add_provider$MH = RuntimeHelper.downcallHandle(
        "gtk_style_context_add_provider",
        constants$1825.gtk_style_context_add_provider$FUNC
    );
}


