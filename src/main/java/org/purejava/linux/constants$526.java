// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$526 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$526() {}
    static final FunctionDescriptor getpid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getpid$MH = RuntimeHelper.downcallHandle(
        "getpid",
        constants$526.getpid$FUNC
    );
    static final FunctionDescriptor getppid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getppid$MH = RuntimeHelper.downcallHandle(
        "getppid",
        constants$526.getppid$FUNC
    );
    static final FunctionDescriptor getpgrp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getpgrp$MH = RuntimeHelper.downcallHandle(
        "getpgrp",
        constants$526.getpgrp$FUNC
    );
    static final FunctionDescriptor __getpgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __getpgid$MH = RuntimeHelper.downcallHandle(
        "__getpgid",
        constants$526.__getpgid$FUNC
    );
    static final FunctionDescriptor getpgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle getpgid$MH = RuntimeHelper.downcallHandle(
        "getpgid",
        constants$526.getpgid$FUNC
    );
    static final FunctionDescriptor setpgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setpgid$MH = RuntimeHelper.downcallHandle(
        "setpgid",
        constants$526.setpgid$FUNC
    );
}


