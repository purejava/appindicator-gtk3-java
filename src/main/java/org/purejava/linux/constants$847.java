// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$847 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$847() {}
    static final FunctionDescriptor hb_set_get_max$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_set_get_max$MH = RuntimeHelper.downcallHandle(
        "hb_set_get_max",
        constants$847.hb_set_get_max$FUNC
    );
    static final FunctionDescriptor hb_set_next$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_set_next$MH = RuntimeHelper.downcallHandle(
        "hb_set_next",
        constants$847.hb_set_next$FUNC
    );
    static final FunctionDescriptor hb_set_previous$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_set_previous$MH = RuntimeHelper.downcallHandle(
        "hb_set_previous",
        constants$847.hb_set_previous$FUNC
    );
    static final FunctionDescriptor hb_set_next_range$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_set_next_range$MH = RuntimeHelper.downcallHandle(
        "hb_set_next_range",
        constants$847.hb_set_next_range$FUNC
    );
    static final FunctionDescriptor hb_set_previous_range$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_set_previous_range$MH = RuntimeHelper.downcallHandle(
        "hb_set_previous_range",
        constants$847.hb_set_previous_range$FUNC
    );
    static final FunctionDescriptor hb_set_next_many$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_set_next_many$MH = RuntimeHelper.downcallHandle(
        "hb_set_next_many",
        constants$847.hb_set_next_many$FUNC
    );
}


