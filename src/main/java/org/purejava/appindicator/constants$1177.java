// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1177 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1177() {}
    static final FunctionDescriptor gdk_error_trap_push$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gdk_error_trap_push$MH = RuntimeHelper.downcallHandle(
        "gdk_error_trap_push",
        constants$1177.gdk_error_trap_push$FUNC
    );
    static final FunctionDescriptor gdk_error_trap_pop$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gdk_error_trap_pop$MH = RuntimeHelper.downcallHandle(
        "gdk_error_trap_pop",
        constants$1177.gdk_error_trap_pop$FUNC
    );
    static final FunctionDescriptor gdk_error_trap_pop_ignored$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gdk_error_trap_pop_ignored$MH = RuntimeHelper.downcallHandle(
        "gdk_error_trap_pop_ignored",
        constants$1177.gdk_error_trap_pop_ignored$FUNC
    );
    static final FunctionDescriptor gdk_get_display_arg_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_get_display_arg_name$MH = RuntimeHelper.downcallHandle(
        "gdk_get_display_arg_name",
        constants$1177.gdk_get_display_arg_name$FUNC
    );
    static final FunctionDescriptor gdk_get_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_get_display$MH = RuntimeHelper.downcallHandle(
        "gdk_get_display",
        constants$1177.gdk_get_display$FUNC
    );
    static final FunctionDescriptor gdk_pointer_grab$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_pointer_grab$MH = RuntimeHelper.downcallHandle(
        "gdk_pointer_grab",
        constants$1177.gdk_pointer_grab$FUNC
    );
}


