// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$695 {

    static final FunctionDescriptor g_file_info_set_attribute_object$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_set_attribute_object$MH = RuntimeHelper.downcallHandle(
        "g_file_info_set_attribute_object",
        constants$695.g_file_info_set_attribute_object$FUNC
    );
    static final FunctionDescriptor g_file_info_set_attribute_stringv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_set_attribute_stringv$MH = RuntimeHelper.downcallHandle(
        "g_file_info_set_attribute_stringv",
        constants$695.g_file_info_set_attribute_stringv$FUNC
    );
    static final FunctionDescriptor g_file_info_clear_status$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_clear_status$MH = RuntimeHelper.downcallHandle(
        "g_file_info_clear_status",
        constants$695.g_file_info_clear_status$FUNC
    );
    static final FunctionDescriptor g_file_info_get_deletion_date$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_deletion_date$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_deletion_date",
        constants$695.g_file_info_get_deletion_date$FUNC
    );
    static final FunctionDescriptor g_file_info_get_file_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_file_type$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_file_type",
        constants$695.g_file_info_get_file_type$FUNC
    );
    static final FunctionDescriptor g_file_info_get_is_hidden$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_is_hidden$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_is_hidden",
        constants$695.g_file_info_get_is_hidden$FUNC
    );
}


