// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$67 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$67() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_DOUBLE,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "atof",
        constants$67.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "atoi",
        constants$10.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "atol",
        constants$4.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "atoll",
        constants$4.const$0
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_DOUBLE,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "strtod",
        constants$67.const$5
    );
}


