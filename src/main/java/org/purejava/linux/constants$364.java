// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$364 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$364() {}
    static final FunctionDescriptor pthread_mutexattr_getpshared$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutexattr_getpshared$MH = RuntimeHelper.downcallHandle(
        "pthread_mutexattr_getpshared",
        constants$364.pthread_mutexattr_getpshared$FUNC
    );
    static final FunctionDescriptor pthread_mutexattr_setpshared$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_mutexattr_setpshared$MH = RuntimeHelper.downcallHandle(
        "pthread_mutexattr_setpshared",
        constants$364.pthread_mutexattr_setpshared$FUNC
    );
    static final FunctionDescriptor pthread_mutexattr_gettype$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutexattr_gettype$MH = RuntimeHelper.downcallHandle(
        "pthread_mutexattr_gettype",
        constants$364.pthread_mutexattr_gettype$FUNC
    );
    static final FunctionDescriptor pthread_mutexattr_settype$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_mutexattr_settype$MH = RuntimeHelper.downcallHandle(
        "pthread_mutexattr_settype",
        constants$364.pthread_mutexattr_settype$FUNC
    );
    static final FunctionDescriptor pthread_mutexattr_getprotocol$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutexattr_getprotocol$MH = RuntimeHelper.downcallHandle(
        "pthread_mutexattr_getprotocol",
        constants$364.pthread_mutexattr_getprotocol$FUNC
    );
    static final FunctionDescriptor pthread_mutexattr_setprotocol$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_mutexattr_setprotocol$MH = RuntimeHelper.downcallHandle(
        "pthread_mutexattr_setprotocol",
        constants$364.pthread_mutexattr_setprotocol$FUNC
    );
}


