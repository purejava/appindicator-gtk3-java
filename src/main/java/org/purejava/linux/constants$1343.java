// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1343 {

    static final FunctionDescriptor gdk_flush$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gdk_flush$MH = RuntimeHelper.downcallHandle(
        "gdk_flush",
        constants$1343.gdk_flush$FUNC
    );
    static final FunctionDescriptor gdk_disable_multidevice$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gdk_disable_multidevice$MH = RuntimeHelper.downcallHandle(
        "gdk_disable_multidevice",
        constants$1343.gdk_disable_multidevice$FUNC
    );
    static final FunctionDescriptor gdk_set_allowed_backends$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_set_allowed_backends$MH = RuntimeHelper.downcallHandle(
        "gdk_set_allowed_backends",
        constants$1343.gdk_set_allowed_backends$FUNC
    );
    static final FunctionDescriptor gdk_pango_context_get_for_screen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pango_context_get_for_screen$MH = RuntimeHelper.downcallHandle(
        "gdk_pango_context_get_for_screen",
        constants$1343.gdk_pango_context_get_for_screen$FUNC
    );
    static final FunctionDescriptor gdk_pango_context_get_for_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pango_context_get_for_display$MH = RuntimeHelper.downcallHandle(
        "gdk_pango_context_get_for_display",
        constants$1343.gdk_pango_context_get_for_display$FUNC
    );
    static final FunctionDescriptor gdk_pango_context_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_pango_context_get$MH = RuntimeHelper.downcallHandle(
        "gdk_pango_context_get",
        constants$1343.gdk_pango_context_get$FUNC
    );
}


