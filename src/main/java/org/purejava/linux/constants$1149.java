// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1149 {

    static final FunctionDescriptor perror$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle perror$MH = RuntimeHelper.downcallHandle(
        "perror",
        constants$1149.perror$FUNC
    );
    static final FunctionDescriptor fileno$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fileno$MH = RuntimeHelper.downcallHandle(
        "fileno",
        constants$1149.fileno$FUNC
    );
    static final FunctionDescriptor fileno_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fileno_unlocked$MH = RuntimeHelper.downcallHandle(
        "fileno_unlocked",
        constants$1149.fileno_unlocked$FUNC
    );
    static final FunctionDescriptor pclose$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pclose$MH = RuntimeHelper.downcallHandle(
        "pclose",
        constants$1149.pclose$FUNC
    );
    static final FunctionDescriptor popen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle popen$MH = RuntimeHelper.downcallHandle(
        "popen",
        constants$1149.popen$FUNC
    );
    static final FunctionDescriptor ctermid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ctermid$MH = RuntimeHelper.downcallHandle(
        "ctermid",
        constants$1149.ctermid$FUNC
    );
}

