// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1047 {

    static final FunctionDescriptor pango_coverage_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_coverage_ref$MH = RuntimeHelper.downcallHandle(
        "pango_coverage_ref",
        constants$1047.pango_coverage_ref$FUNC
    );
    static final FunctionDescriptor pango_coverage_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_coverage_unref$MH = RuntimeHelper.downcallHandle(
        "pango_coverage_unref",
        constants$1047.pango_coverage_unref$FUNC
    );
    static final FunctionDescriptor pango_coverage_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_coverage_copy$MH = RuntimeHelper.downcallHandle(
        "pango_coverage_copy",
        constants$1047.pango_coverage_copy$FUNC
    );
    static final FunctionDescriptor pango_coverage_get$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_coverage_get$MH = RuntimeHelper.downcallHandle(
        "pango_coverage_get",
        constants$1047.pango_coverage_get$FUNC
    );
    static final FunctionDescriptor pango_coverage_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_coverage_set$MH = RuntimeHelper.downcallHandle(
        "pango_coverage_set",
        constants$1047.pango_coverage_set$FUNC
    );
    static final FunctionDescriptor pango_coverage_max$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_coverage_max$MH = RuntimeHelper.downcallHandle(
        "pango_coverage_max",
        constants$1047.pango_coverage_max$FUNC
    );
}


