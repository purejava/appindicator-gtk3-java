// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$281 {

    static final FunctionDescriptor g_match_info_fetch_all$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_match_info_fetch_all$MH = RuntimeHelper.downcallHandle(
        "g_match_info_fetch_all",
        constants$281.g_match_info_fetch_all$FUNC
    );
    static final FunctionDescriptor GScannerMsgFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle GScannerMsgFunc$MH = RuntimeHelper.downcallHandle(
        constants$281.GScannerMsgFunc$FUNC
    );
    static final FunctionDescriptor g_scanner_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_new$MH = RuntimeHelper.downcallHandle(
        "g_scanner_new",
        constants$281.g_scanner_new$FUNC
    );
    static final FunctionDescriptor g_scanner_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_destroy$MH = RuntimeHelper.downcallHandle(
        "g_scanner_destroy",
        constants$281.g_scanner_destroy$FUNC
    );
    static final FunctionDescriptor g_scanner_input_file$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_scanner_input_file$MH = RuntimeHelper.downcallHandle(
        "g_scanner_input_file",
        constants$281.g_scanner_input_file$FUNC
    );
}

