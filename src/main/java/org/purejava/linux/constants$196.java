// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$196 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$196() {}
    static final OfAddress g_ascii_table$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle g_ascii_table$VH = constants$196.g_ascii_table$LAYOUT.varHandle();
    static final MemorySegment g_ascii_table$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_ascii_table", constants$196.g_ascii_table$LAYOUT);
    static final FunctionDescriptor g_ascii_tolower$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_ascii_tolower$MH = RuntimeHelper.downcallHandle(
        "g_ascii_tolower",
        constants$196.g_ascii_tolower$FUNC
    );
    static final FunctionDescriptor g_ascii_toupper$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_ascii_toupper$MH = RuntimeHelper.downcallHandle(
        "g_ascii_toupper",
        constants$196.g_ascii_toupper$FUNC
    );
    static final FunctionDescriptor g_ascii_digit_value$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_ascii_digit_value$MH = RuntimeHelper.downcallHandle(
        "g_ascii_digit_value",
        constants$196.g_ascii_digit_value$FUNC
    );
    static final FunctionDescriptor g_ascii_xdigit_value$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_ascii_xdigit_value$MH = RuntimeHelper.downcallHandle(
        "g_ascii_xdigit_value",
        constants$196.g_ascii_xdigit_value$FUNC
    );
    static final FunctionDescriptor g_strdelimit$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_strdelimit$MH = RuntimeHelper.downcallHandle(
        "g_strdelimit",
        constants$196.g_strdelimit$FUNC
    );
}


