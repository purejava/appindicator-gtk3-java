// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1285 {

    static final FunctionDescriptor gdk_color_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_color_hash$MH = RuntimeHelper.downcallHandle(
        "gdk_color_hash",
        constants$1285.gdk_color_hash$FUNC
    );
    static final FunctionDescriptor gdk_color_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_color_equal$MH = RuntimeHelper.downcallHandle(
        "gdk_color_equal",
        constants$1285.gdk_color_equal$FUNC
    );
    static final FunctionDescriptor gdk_color_parse$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_color_parse$MH = RuntimeHelper.downcallHandle(
        "gdk_color_parse",
        constants$1285.gdk_color_parse$FUNC
    );
    static final FunctionDescriptor gdk_color_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_color_to_string$MH = RuntimeHelper.downcallHandle(
        "gdk_color_to_string",
        constants$1285.gdk_color_to_string$FUNC
    );
    static final FunctionDescriptor gdk_rgba_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_rgba_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_rgba_get_type",
        constants$1285.gdk_rgba_get_type$FUNC
    );
    static final FunctionDescriptor gdk_rgba_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_rgba_copy$MH = RuntimeHelper.downcallHandle(
        "gdk_rgba_copy",
        constants$1285.gdk_rgba_copy$FUNC
    );
}


