// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1260 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1260() {}
    static final FunctionDescriptor gtk_widget_set_visible$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_set_visible$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_visible",
        constants$1260.gtk_widget_set_visible$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_visible$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_visible$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_visible",
        constants$1260.gtk_widget_get_visible$FUNC
    );
    static final FunctionDescriptor gtk_widget_is_visible$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_is_visible$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_is_visible",
        constants$1260.gtk_widget_is_visible$FUNC
    );
    static final FunctionDescriptor gtk_widget_set_has_window$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_set_has_window$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_has_window",
        constants$1260.gtk_widget_set_has_window$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_has_window$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_has_window$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_has_window",
        constants$1260.gtk_widget_get_has_window$FUNC
    );
    static final FunctionDescriptor gtk_widget_is_toplevel$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_is_toplevel$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_is_toplevel",
        constants$1260.gtk_widget_is_toplevel$FUNC
    );
}


