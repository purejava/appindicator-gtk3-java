// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$697 {

    static final FunctionDescriptor g_file_info_get_symbolic_icon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_symbolic_icon$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_symbolic_icon",
        constants$697.g_file_info_get_symbolic_icon$FUNC
    );
    static final FunctionDescriptor g_file_info_get_content_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_content_type$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_content_type",
        constants$697.g_file_info_get_content_type$FUNC
    );
    static final FunctionDescriptor g_file_info_get_size$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_size$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_size",
        constants$697.g_file_info_get_size$FUNC
    );
    static final FunctionDescriptor g_file_info_get_modification_time$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_modification_time$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_modification_time",
        constants$697.g_file_info_get_modification_time$FUNC
    );
    static final FunctionDescriptor g_file_info_get_modification_date_time$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_modification_date_time$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_modification_date_time",
        constants$697.g_file_info_get_modification_date_time$FUNC
    );
    static final FunctionDescriptor g_file_info_get_access_date_time$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_access_date_time$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_access_date_time",
        constants$697.g_file_info_get_access_date_time$FUNC
    );
}

