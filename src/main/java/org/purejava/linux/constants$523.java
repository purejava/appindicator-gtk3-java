// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$523 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$523() {}
    static final FunctionDescriptor getcwd$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle getcwd$MH = RuntimeHelper.downcallHandle(
        "getcwd",
        constants$523.getcwd$FUNC
    );
    static final FunctionDescriptor getwd$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getwd$MH = RuntimeHelper.downcallHandle(
        "getwd",
        constants$523.getwd$FUNC
    );
    static final FunctionDescriptor dup$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle dup$MH = RuntimeHelper.downcallHandle(
        "dup",
        constants$523.dup$FUNC
    );
    static final FunctionDescriptor dup2$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle dup2$MH = RuntimeHelper.downcallHandle(
        "dup2",
        constants$523.dup2$FUNC
    );
    static final OfAddress __environ$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __environ$VH = constants$523.__environ$LAYOUT.varHandle();
    static final MemorySegment __environ$SEGMENT = RuntimeHelper.lookupGlobalVariable("__environ", constants$523.__environ$LAYOUT);
    static final FunctionDescriptor execve$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle execve$MH = RuntimeHelper.downcallHandle(
        "execve",
        constants$523.execve$FUNC
    );
}


