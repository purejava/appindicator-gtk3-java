// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$360 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$360() {}
    static final FunctionDescriptor pthread_getschedparam$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_getschedparam$MH = RuntimeHelper.downcallHandle(
        "pthread_getschedparam",
        constants$360.pthread_getschedparam$FUNC
    );
    static final FunctionDescriptor pthread_setschedprio$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_setschedprio$MH = RuntimeHelper.downcallHandle(
        "pthread_setschedprio",
        constants$360.pthread_setschedprio$FUNC
    );
    static final FunctionDescriptor pthread_once$__init_routine$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor pthread_once$__init_routine_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle pthread_once$__init_routine_UP$MH = RuntimeHelper.upcallHandle(pthread_once$__init_routine.class, "apply", constants$360.pthread_once$__init_routine_UP$FUNC);
    static final FunctionDescriptor pthread_once$__init_routine_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle pthread_once$__init_routine_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$360.pthread_once$__init_routine_DOWN$FUNC
    );
    static final FunctionDescriptor pthread_once$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_once$MH = RuntimeHelper.downcallHandle(
        "pthread_once",
        constants$360.pthread_once$FUNC
    );
    static final FunctionDescriptor pthread_setcancelstate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_setcancelstate$MH = RuntimeHelper.downcallHandle(
        "pthread_setcancelstate",
        constants$360.pthread_setcancelstate$FUNC
    );
}


