// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$971 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$971() {}
    static final FunctionDescriptor pango_layout_iter_at_last_line$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_iter_at_last_line$MH = RuntimeHelper.downcallHandle(
        "pango_layout_iter_at_last_line",
        constants$971.pango_layout_iter_at_last_line$FUNC
    );
    static final FunctionDescriptor pango_layout_iter_get_layout$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_iter_get_layout$MH = RuntimeHelper.downcallHandle(
        "pango_layout_iter_get_layout",
        constants$971.pango_layout_iter_get_layout$FUNC
    );
    static final FunctionDescriptor pango_layout_iter_next_char$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_iter_next_char$MH = RuntimeHelper.downcallHandle(
        "pango_layout_iter_next_char",
        constants$971.pango_layout_iter_next_char$FUNC
    );
    static final FunctionDescriptor pango_layout_iter_next_cluster$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_iter_next_cluster$MH = RuntimeHelper.downcallHandle(
        "pango_layout_iter_next_cluster",
        constants$971.pango_layout_iter_next_cluster$FUNC
    );
    static final FunctionDescriptor pango_layout_iter_next_run$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_iter_next_run$MH = RuntimeHelper.downcallHandle(
        "pango_layout_iter_next_run",
        constants$971.pango_layout_iter_next_run$FUNC
    );
    static final FunctionDescriptor pango_layout_iter_next_line$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_iter_next_line$MH = RuntimeHelper.downcallHandle(
        "pango_layout_iter_next_line",
        constants$971.pango_layout_iter_next_line$FUNC
    );
}


