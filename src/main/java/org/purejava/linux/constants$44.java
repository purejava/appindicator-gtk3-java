// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$44 {

    static final FunctionDescriptor a64l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle a64l$MH = RuntimeHelper.downcallHandle(
        "a64l",
        constants$44.a64l$FUNC
    );
    static final FunctionDescriptor __bswap_16$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle __bswap_16$MH = RuntimeHelper.downcallHandle(
        "__bswap_16",
        constants$44.__bswap_16$FUNC
    );
    static final FunctionDescriptor __bswap_32$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __bswap_32$MH = RuntimeHelper.downcallHandle(
        "__bswap_32",
        constants$44.__bswap_32$FUNC
    );
    static final FunctionDescriptor __bswap_64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __bswap_64$MH = RuntimeHelper.downcallHandle(
        "__bswap_64",
        constants$44.__bswap_64$FUNC
    );
    static final FunctionDescriptor __uint16_identity$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle __uint16_identity$MH = RuntimeHelper.downcallHandle(
        "__uint16_identity",
        constants$44.__uint16_identity$FUNC
    );
    static final FunctionDescriptor __uint32_identity$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __uint32_identity$MH = RuntimeHelper.downcallHandle(
        "__uint32_identity",
        constants$44.__uint32_identity$FUNC
    );
}


