// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$629 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$629() {}
    static final FunctionDescriptor g_file_set_attributes_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_attributes_async$MH = RuntimeHelper.downcallHandle(
        "g_file_set_attributes_async",
        constants$629.g_file_set_attributes_async$FUNC
    );
    static final FunctionDescriptor g_file_set_attributes_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_attributes_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_set_attributes_finish",
        constants$629.g_file_set_attributes_finish$FUNC
    );
    static final FunctionDescriptor g_file_set_attribute_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_attribute_string$MH = RuntimeHelper.downcallHandle(
        "g_file_set_attribute_string",
        constants$629.g_file_set_attribute_string$FUNC
    );
    static final FunctionDescriptor g_file_set_attribute_byte_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_attribute_byte_string$MH = RuntimeHelper.downcallHandle(
        "g_file_set_attribute_byte_string",
        constants$629.g_file_set_attribute_byte_string$FUNC
    );
    static final FunctionDescriptor g_file_set_attribute_uint32$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_attribute_uint32$MH = RuntimeHelper.downcallHandle(
        "g_file_set_attribute_uint32",
        constants$629.g_file_set_attribute_uint32$FUNC
    );
    static final FunctionDescriptor g_file_set_attribute_int32$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_attribute_int32$MH = RuntimeHelper.downcallHandle(
        "g_file_set_attribute_int32",
        constants$629.g_file_set_attribute_int32$FUNC
    );
}


