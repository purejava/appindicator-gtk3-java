// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$690 {

    static final FunctionDescriptor g_file_info_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_file_info_get_type$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_type",
        constants$690.g_file_info_get_type$FUNC
    );
    static final FunctionDescriptor g_file_info_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_file_info_new$MH = RuntimeHelper.downcallHandle(
        "g_file_info_new",
        constants$690.g_file_info_new$FUNC
    );
    static final FunctionDescriptor g_file_info_dup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_dup$MH = RuntimeHelper.downcallHandle(
        "g_file_info_dup",
        constants$690.g_file_info_dup$FUNC
    );
    static final FunctionDescriptor g_file_info_copy_into$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_copy_into$MH = RuntimeHelper.downcallHandle(
        "g_file_info_copy_into",
        constants$690.g_file_info_copy_into$FUNC
    );
    static final FunctionDescriptor g_file_info_has_attribute$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_has_attribute$MH = RuntimeHelper.downcallHandle(
        "g_file_info_has_attribute",
        constants$690.g_file_info_has_attribute$FUNC
    );
    static final FunctionDescriptor g_file_info_has_namespace$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_has_namespace$MH = RuntimeHelper.downcallHandle(
        "g_file_info_has_namespace",
        constants$690.g_file_info_has_namespace$FUNC
    );
}


