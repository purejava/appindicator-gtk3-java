// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$189 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$189() {}
    static final FunctionDescriptor g_unichar_break_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_unichar_break_type$MH = RuntimeHelper.downcallHandle(
        "g_unichar_break_type",
        constants$189.g_unichar_break_type$FUNC
    );
    static final FunctionDescriptor g_unichar_combining_class$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_unichar_combining_class$MH = RuntimeHelper.downcallHandle(
        "g_unichar_combining_class",
        constants$189.g_unichar_combining_class$FUNC
    );
    static final FunctionDescriptor g_unichar_get_mirror_char$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unichar_get_mirror_char$MH = RuntimeHelper.downcallHandle(
        "g_unichar_get_mirror_char",
        constants$189.g_unichar_get_mirror_char$FUNC
    );
    static final FunctionDescriptor g_unichar_get_script$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_unichar_get_script$MH = RuntimeHelper.downcallHandle(
        "g_unichar_get_script",
        constants$189.g_unichar_get_script$FUNC
    );
    static final FunctionDescriptor g_unichar_validate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_unichar_validate$MH = RuntimeHelper.downcallHandle(
        "g_unichar_validate",
        constants$189.g_unichar_validate$FUNC
    );
    static final FunctionDescriptor g_unichar_compose$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unichar_compose$MH = RuntimeHelper.downcallHandle(
        "g_unichar_compose",
        constants$189.g_unichar_compose$FUNC
    );
}


