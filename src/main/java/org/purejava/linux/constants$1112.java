// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1112 {

    static final FunctionDescriptor pango_tab_array_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_tab_array_to_string$MH = RuntimeHelper.downcallHandle(
        "pango_tab_array_to_string",
        constants$1112.pango_tab_array_to_string$FUNC
    );
    static final FunctionDescriptor pango_tab_array_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_tab_array_from_string$MH = RuntimeHelper.downcallHandle(
        "pango_tab_array_from_string",
        constants$1112.pango_tab_array_from_string$FUNC
    );
    static final FunctionDescriptor pango_tab_array_set_decimal_point$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_tab_array_set_decimal_point$MH = RuntimeHelper.downcallHandle(
        "pango_tab_array_set_decimal_point",
        constants$1112.pango_tab_array_set_decimal_point$FUNC
    );
    static final FunctionDescriptor pango_tab_array_get_decimal_point$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_tab_array_get_decimal_point$MH = RuntimeHelper.downcallHandle(
        "pango_tab_array_get_decimal_point",
        constants$1112.pango_tab_array_get_decimal_point$FUNC
    );
    static final FunctionDescriptor pango_tab_array_sort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_tab_array_sort$MH = RuntimeHelper.downcallHandle(
        "pango_tab_array_sort",
        constants$1112.pango_tab_array_sort$FUNC
    );
    static final FunctionDescriptor glib_autoptr_clear_PangoTabArray$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_clear_PangoTabArray$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_clear_PangoTabArray",
        constants$1112.glib_autoptr_clear_PangoTabArray$FUNC
    );
}

