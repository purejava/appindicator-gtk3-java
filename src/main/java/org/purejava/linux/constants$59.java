// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$59 {

    static final FunctionDescriptor wcstombs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle wcstombs$MH = RuntimeHelper.downcallHandle(
        "wcstombs",
        constants$59.wcstombs$FUNC
    );
    static final FunctionDescriptor rpmatch$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rpmatch$MH = RuntimeHelper.downcallHandle(
        "rpmatch",
        constants$59.rpmatch$FUNC
    );
    static final FunctionDescriptor getsubopt$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getsubopt$MH = RuntimeHelper.downcallHandle(
        "getsubopt",
        constants$59.getsubopt$FUNC
    );
    static final FunctionDescriptor getloadavg$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle getloadavg$MH = RuntimeHelper.downcallHandle(
        "getloadavg",
        constants$59.getloadavg$FUNC
    );
    static final FunctionDescriptor g_thread_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_thread_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_thread_error_quark",
        constants$59.g_thread_error_quark$FUNC
    );
    static final FunctionDescriptor GThreadFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


