// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$800 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$800() {}
    static final FunctionDescriptor g_test_dbus_unset$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_test_dbus_unset$MH = RuntimeHelper.downcallHandle(
        "g_test_dbus_unset",
        constants$800.g_test_dbus_unset$FUNC
    );
    static final FunctionDescriptor g_themed_icon_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_themed_icon_get_type$MH = RuntimeHelper.downcallHandle(
        "g_themed_icon_get_type",
        constants$800.g_themed_icon_get_type$FUNC
    );
    static final FunctionDescriptor g_themed_icon_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_themed_icon_new$MH = RuntimeHelper.downcallHandle(
        "g_themed_icon_new",
        constants$800.g_themed_icon_new$FUNC
    );
    static final FunctionDescriptor g_themed_icon_new_with_default_fallbacks$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_themed_icon_new_with_default_fallbacks$MH = RuntimeHelper.downcallHandle(
        "g_themed_icon_new_with_default_fallbacks",
        constants$800.g_themed_icon_new_with_default_fallbacks$FUNC
    );
    static final FunctionDescriptor g_themed_icon_new_from_names$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_themed_icon_new_from_names$MH = RuntimeHelper.downcallHandle(
        "g_themed_icon_new_from_names",
        constants$800.g_themed_icon_new_from_names$FUNC
    );
    static final FunctionDescriptor g_themed_icon_prepend_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_themed_icon_prepend_name$MH = RuntimeHelper.downcallHandle(
        "g_themed_icon_prepend_name",
        constants$800.g_themed_icon_prepend_name$FUNC
    );
}


