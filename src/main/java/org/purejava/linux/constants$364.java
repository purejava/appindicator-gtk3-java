// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$364 {

    static final FunctionDescriptor pthread_cond_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_cond_init$MH = RuntimeHelper.downcallHandle(
        "pthread_cond_init",
        constants$364.pthread_cond_init$FUNC
    );
    static final FunctionDescriptor pthread_cond_destroy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_cond_destroy$MH = RuntimeHelper.downcallHandle(
        "pthread_cond_destroy",
        constants$364.pthread_cond_destroy$FUNC
    );
    static final FunctionDescriptor pthread_cond_signal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_cond_signal$MH = RuntimeHelper.downcallHandle(
        "pthread_cond_signal",
        constants$364.pthread_cond_signal$FUNC
    );
    static final FunctionDescriptor pthread_cond_broadcast$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_cond_broadcast$MH = RuntimeHelper.downcallHandle(
        "pthread_cond_broadcast",
        constants$364.pthread_cond_broadcast$FUNC
    );
    static final FunctionDescriptor pthread_cond_wait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_cond_wait$MH = RuntimeHelper.downcallHandle(
        "pthread_cond_wait",
        constants$364.pthread_cond_wait$FUNC
    );
    static final FunctionDescriptor pthread_cond_timedwait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_cond_timedwait$MH = RuntimeHelper.downcallHandle(
        "pthread_cond_timedwait",
        constants$364.pthread_cond_timedwait$FUNC
    );
}


