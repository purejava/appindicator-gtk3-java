// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$36 {

    static final FunctionDescriptor g_get_home_dir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_home_dir$MH = RuntimeHelper.downcallHandle(
        "g_get_home_dir",
        constants$36.g_get_home_dir$FUNC
    );
    static final FunctionDescriptor g_get_tmp_dir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_tmp_dir$MH = RuntimeHelper.downcallHandle(
        "g_get_tmp_dir",
        constants$36.g_get_tmp_dir$FUNC
    );
    static final FunctionDescriptor g_get_host_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_host_name$MH = RuntimeHelper.downcallHandle(
        "g_get_host_name",
        constants$36.g_get_host_name$FUNC
    );
    static final FunctionDescriptor g_get_prgname$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_prgname$MH = RuntimeHelper.downcallHandle(
        "g_get_prgname",
        constants$36.g_get_prgname$FUNC
    );
    static final FunctionDescriptor g_set_prgname$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_set_prgname$MH = RuntimeHelper.downcallHandle(
        "g_set_prgname",
        constants$36.g_set_prgname$FUNC
    );
    static final FunctionDescriptor g_get_application_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_application_name$MH = RuntimeHelper.downcallHandle(
        "g_get_application_name",
        constants$36.g_get_application_name$FUNC
    );
}


