// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1118 {

    static final FunctionDescriptor pango_layout_set_justify$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_set_justify$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_justify",
        constants$1118.pango_layout_set_justify$FUNC
    );
    static final FunctionDescriptor pango_layout_get_justify$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_justify$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_justify",
        constants$1118.pango_layout_get_justify$FUNC
    );
    static final FunctionDescriptor pango_layout_set_justify_last_line$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_set_justify_last_line$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_justify_last_line",
        constants$1118.pango_layout_set_justify_last_line$FUNC
    );
    static final FunctionDescriptor pango_layout_get_justify_last_line$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_justify_last_line$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_justify_last_line",
        constants$1118.pango_layout_get_justify_last_line$FUNC
    );
    static final FunctionDescriptor pango_layout_set_auto_dir$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_set_auto_dir$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_auto_dir",
        constants$1118.pango_layout_set_auto_dir$FUNC
    );
    static final FunctionDescriptor pango_layout_get_auto_dir$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_auto_dir$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_auto_dir",
        constants$1118.pango_layout_get_auto_dir$FUNC
    );
}


