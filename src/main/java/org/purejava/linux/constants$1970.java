// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1970 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1970() {}
    static final FunctionDescriptor gtk_tearoff_menu_item_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_tearoff_menu_item_new$MH = RuntimeHelper.downcallHandle(
        "gtk_tearoff_menu_item_new",
        constants$1970.gtk_tearoff_menu_item_new$FUNC
    );
    static final FunctionDescriptor gtk_theming_engine_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_theming_engine_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_theming_engine_get_type",
        constants$1970.gtk_theming_engine_get_type$FUNC
    );
    static final FunctionDescriptor gtk_theming_engine_register_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_theming_engine_register_property$MH = RuntimeHelper.downcallHandle(
        "gtk_theming_engine_register_property",
        constants$1970.gtk_theming_engine_register_property$FUNC
    );
    static final FunctionDescriptor gtk_theming_engine_get_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_theming_engine_get_property$MH = RuntimeHelper.downcallHandle(
        "gtk_theming_engine_get_property",
        constants$1970.gtk_theming_engine_get_property$FUNC
    );
    static final FunctionDescriptor gtk_theming_engine_get_valist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_theming_engine_get_valist$MH = RuntimeHelper.downcallHandle(
        "gtk_theming_engine_get_valist",
        constants$1970.gtk_theming_engine_get_valist$FUNC
    );
    static final FunctionDescriptor gtk_theming_engine_get$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_theming_engine_get$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_theming_engine_get",
        constants$1970.gtk_theming_engine_get$FUNC
    );
}


