// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1052 {

    static final FunctionDescriptor pango_script_for_unichar$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_script_for_unichar$MH = RuntimeHelper.downcallHandle(
        "pango_script_for_unichar",
        constants$1052.pango_script_for_unichar$FUNC
    );
    static final FunctionDescriptor pango_script_iter_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_script_iter_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_script_iter_get_type",
        constants$1052.pango_script_iter_get_type$FUNC
    );
    static final FunctionDescriptor pango_script_iter_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_script_iter_new$MH = RuntimeHelper.downcallHandle(
        "pango_script_iter_new",
        constants$1052.pango_script_iter_new$FUNC
    );
    static final FunctionDescriptor pango_script_iter_get_range$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_script_iter_get_range$MH = RuntimeHelper.downcallHandle(
        "pango_script_iter_get_range",
        constants$1052.pango_script_iter_get_range$FUNC
    );
    static final FunctionDescriptor pango_script_iter_next$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_script_iter_next$MH = RuntimeHelper.downcallHandle(
        "pango_script_iter_next",
        constants$1052.pango_script_iter_next$FUNC
    );
    static final FunctionDescriptor pango_script_iter_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_script_iter_free$MH = RuntimeHelper.downcallHandle(
        "pango_script_iter_free",
        constants$1052.pango_script_iter_free$FUNC
    );
}

