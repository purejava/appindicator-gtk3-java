// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$684 {

    static final FunctionDescriptor g_file_load_contents$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_load_contents$MH = RuntimeHelper.downcallHandle(
        "g_file_load_contents",
        constants$684.g_file_load_contents$FUNC
    );
    static final FunctionDescriptor g_file_load_contents_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_load_contents_async$MH = RuntimeHelper.downcallHandle(
        "g_file_load_contents_async",
        constants$684.g_file_load_contents_async$FUNC
    );
    static final FunctionDescriptor g_file_load_contents_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_load_contents_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_load_contents_finish",
        constants$684.g_file_load_contents_finish$FUNC
    );
    static final FunctionDescriptor g_file_load_partial_contents_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_load_partial_contents_async$MH = RuntimeHelper.downcallHandle(
        "g_file_load_partial_contents_async",
        constants$684.g_file_load_partial_contents_async$FUNC
    );
    static final FunctionDescriptor g_file_load_partial_contents_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_load_partial_contents_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_load_partial_contents_finish",
        constants$684.g_file_load_partial_contents_finish$FUNC
    );
    static final FunctionDescriptor g_file_replace_contents$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_replace_contents$MH = RuntimeHelper.downcallHandle(
        "g_file_replace_contents",
        constants$684.g_file_replace_contents$FUNC
    );
}


