// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1247 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1247() {}
    static final FunctionDescriptor GtkTickCallback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkTickCallback_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTickCallback_UP$MH = RuntimeHelper.upcallHandle(GtkTickCallback.class, "apply", constants$1247.GtkTickCallback_UP$FUNC);
    static final FunctionDescriptor GtkTickCallback_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTickCallback_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1247.GtkTickCallback_DOWN$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_widget_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_type",
        constants$1247.gtk_widget_get_type$FUNC
    );
    static final FunctionDescriptor gtk_widget_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_new$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_widget_new",
        constants$1247.gtk_widget_new$FUNC
    );
    static final FunctionDescriptor gtk_widget_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_destroy$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_destroy",
        constants$1247.gtk_widget_destroy$FUNC
    );
    static final FunctionDescriptor gtk_widget_destroyed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_destroyed$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_destroyed",
        constants$1247.gtk_widget_destroyed$FUNC
    );
}


