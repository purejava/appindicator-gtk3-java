// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$29 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$29() {}
    static final FunctionDescriptor g_byte_array_append$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_byte_array_append$MH = RuntimeHelper.downcallHandle(
        "g_byte_array_append",
        constants$29.g_byte_array_append$FUNC
    );
    static final FunctionDescriptor g_byte_array_prepend$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_byte_array_prepend$MH = RuntimeHelper.downcallHandle(
        "g_byte_array_prepend",
        constants$29.g_byte_array_prepend$FUNC
    );
    static final FunctionDescriptor g_byte_array_set_size$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_byte_array_set_size$MH = RuntimeHelper.downcallHandle(
        "g_byte_array_set_size",
        constants$29.g_byte_array_set_size$FUNC
    );
    static final FunctionDescriptor g_byte_array_remove_index$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_byte_array_remove_index$MH = RuntimeHelper.downcallHandle(
        "g_byte_array_remove_index",
        constants$29.g_byte_array_remove_index$FUNC
    );
    static final FunctionDescriptor g_byte_array_remove_index_fast$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_byte_array_remove_index_fast$MH = RuntimeHelper.downcallHandle(
        "g_byte_array_remove_index_fast",
        constants$29.g_byte_array_remove_index_fast$FUNC
    );
    static final FunctionDescriptor g_byte_array_remove_range$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_byte_array_remove_range$MH = RuntimeHelper.downcallHandle(
        "g_byte_array_remove_range",
        constants$29.g_byte_array_remove_range$FUNC
    );
}


