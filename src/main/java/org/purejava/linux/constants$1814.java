// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1814 {

    static final FunctionDescriptor gtk_header_bar_set_decoration_layout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_header_bar_set_decoration_layout$MH = RuntimeHelper.downcallHandle(
        "gtk_header_bar_set_decoration_layout",
        constants$1814.gtk_header_bar_set_decoration_layout$FUNC
    );
    static final FunctionDescriptor gtk_header_bar_get_decoration_layout$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_header_bar_get_decoration_layout$MH = RuntimeHelper.downcallHandle(
        "gtk_header_bar_get_decoration_layout",
        constants$1814.gtk_header_bar_get_decoration_layout$FUNC
    );
    static final FunctionDescriptor gtk_icon_factory_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_icon_factory_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_factory_get_type",
        constants$1814.gtk_icon_factory_get_type$FUNC
    );
    static final FunctionDescriptor gtk_icon_factory_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_icon_factory_new$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_factory_new",
        constants$1814.gtk_icon_factory_new$FUNC
    );
    static final FunctionDescriptor gtk_icon_factory_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_factory_add$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_factory_add",
        constants$1814.gtk_icon_factory_add$FUNC
    );
    static final FunctionDescriptor gtk_icon_factory_lookup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_factory_lookup$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_factory_lookup",
        constants$1814.gtk_icon_factory_lookup$FUNC
    );
}

