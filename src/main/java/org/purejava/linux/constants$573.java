// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$573 {

    static final FunctionDescriptor setpgrp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle setpgrp$MH = RuntimeHelper.downcallHandle(
        "setpgrp",
        constants$573.setpgrp$FUNC
    );
    static final FunctionDescriptor setsid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle setsid$MH = RuntimeHelper.downcallHandle(
        "setsid",
        constants$573.setsid$FUNC
    );
    static final FunctionDescriptor getsid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle getsid$MH = RuntimeHelper.downcallHandle(
        "getsid",
        constants$573.getsid$FUNC
    );
    static final FunctionDescriptor getuid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getuid$MH = RuntimeHelper.downcallHandle(
        "getuid",
        constants$573.getuid$FUNC
    );
    static final FunctionDescriptor geteuid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle geteuid$MH = RuntimeHelper.downcallHandle(
        "geteuid",
        constants$573.geteuid$FUNC
    );
    static final FunctionDescriptor getgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getgid$MH = RuntimeHelper.downcallHandle(
        "getgid",
        constants$573.getgid$FUNC
    );
}


