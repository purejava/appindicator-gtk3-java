// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$247 {

    static final FunctionDescriptor GLogWriterFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GLogWriterFunc$MH = RuntimeHelper.downcallHandle(
        constants$247.GLogWriterFunc$FUNC
    );
    static final FunctionDescriptor g_log_structured$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_log_structured$MH = RuntimeHelper.downcallHandleVariadic(
        "g_log_structured",
        constants$247.g_log_structured$FUNC
    );
    static final FunctionDescriptor g_log_structured_array$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_log_structured_array$MH = RuntimeHelper.downcallHandle(
        "g_log_structured_array",
        constants$247.g_log_structured_array$FUNC
    );
    static final FunctionDescriptor g_log_variant$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_log_variant$MH = RuntimeHelper.downcallHandle(
        "g_log_variant",
        constants$247.g_log_variant$FUNC
    );
    static final FunctionDescriptor g_log_set_writer_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_log_set_writer_func$MH = RuntimeHelper.downcallHandle(
        "g_log_set_writer_func",
        constants$247.g_log_set_writer_func$FUNC
    );
}


