// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$256 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$256() {}
    static final FunctionDescriptor g_variant_dict_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dict_clear$MH = RuntimeHelper.downcallHandle(
        "g_variant_dict_clear",
        constants$256.g_variant_dict_clear$FUNC
    );
    static final FunctionDescriptor g_variant_dict_end$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dict_end$MH = RuntimeHelper.downcallHandle(
        "g_variant_dict_end",
        constants$256.g_variant_dict_end$FUNC
    );
    static final FunctionDescriptor g_variant_dict_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dict_ref$MH = RuntimeHelper.downcallHandle(
        "g_variant_dict_ref",
        constants$256.g_variant_dict_ref$FUNC
    );
    static final FunctionDescriptor g_variant_dict_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_dict_unref$MH = RuntimeHelper.downcallHandle(
        "g_variant_dict_unref",
        constants$256.g_variant_dict_unref$FUNC
    );
    static final FunctionDescriptor g_printf_string_upper_bound$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_printf_string_upper_bound$MH = RuntimeHelper.downcallHandle(
        "g_printf_string_upper_bound",
        constants$256.g_printf_string_upper_bound$FUNC
    );
    static final FunctionDescriptor GLogFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GLogFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GLogFunc_UP$MH = RuntimeHelper.upcallHandle(GLogFunc.class, "apply", constants$256.GLogFunc_UP$FUNC);
}


