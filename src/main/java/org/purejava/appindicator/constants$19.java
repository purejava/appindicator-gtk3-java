// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$19 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$19() {}
    static final FunctionDescriptor g_array_sized_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_sized_new$MH = RuntimeHelper.downcallHandle(
        "g_array_sized_new",
        constants$19.g_array_sized_new$FUNC
    );
    static final FunctionDescriptor g_array_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_array_copy$MH = RuntimeHelper.downcallHandle(
        "g_array_copy",
        constants$19.g_array_copy$FUNC
    );
    static final FunctionDescriptor g_array_free$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_array_free$MH = RuntimeHelper.downcallHandle(
        "g_array_free",
        constants$19.g_array_free$FUNC
    );
    static final FunctionDescriptor g_array_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_array_ref$MH = RuntimeHelper.downcallHandle(
        "g_array_ref",
        constants$19.g_array_ref$FUNC
    );
    static final FunctionDescriptor g_array_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_array_unref$MH = RuntimeHelper.downcallHandle(
        "g_array_unref",
        constants$19.g_array_unref$FUNC
    );
    static final FunctionDescriptor g_array_get_element_size$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_array_get_element_size$MH = RuntimeHelper.downcallHandle(
        "g_array_get_element_size",
        constants$19.g_array_get_element_size$FUNC
    );
}


