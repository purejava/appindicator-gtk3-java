// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$362 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$362() {}
    static final FunctionDescriptor __sigsetjmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __sigsetjmp$MH = RuntimeHelper.downcallHandle(
        "__sigsetjmp",
        constants$362.__sigsetjmp$FUNC
    );
    static final FunctionDescriptor pthread_mutex_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutex_init$MH = RuntimeHelper.downcallHandle(
        "pthread_mutex_init",
        constants$362.pthread_mutex_init$FUNC
    );
    static final FunctionDescriptor pthread_mutex_destroy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutex_destroy$MH = RuntimeHelper.downcallHandle(
        "pthread_mutex_destroy",
        constants$362.pthread_mutex_destroy$FUNC
    );
    static final FunctionDescriptor pthread_mutex_trylock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutex_trylock$MH = RuntimeHelper.downcallHandle(
        "pthread_mutex_trylock",
        constants$362.pthread_mutex_trylock$FUNC
    );
    static final FunctionDescriptor pthread_mutex_lock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutex_lock$MH = RuntimeHelper.downcallHandle(
        "pthread_mutex_lock",
        constants$362.pthread_mutex_lock$FUNC
    );
    static final FunctionDescriptor pthread_mutex_timedlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutex_timedlock$MH = RuntimeHelper.downcallHandle(
        "pthread_mutex_timedlock",
        constants$362.pthread_mutex_timedlock$FUNC
    );
}


