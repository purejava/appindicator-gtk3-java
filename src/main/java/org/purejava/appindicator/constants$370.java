// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$370 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$370() {}
    static final FunctionDescriptor pthread_condattr_setclock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_condattr_setclock$MH = RuntimeHelper.downcallHandle(
        "pthread_condattr_setclock",
        constants$370.pthread_condattr_setclock$FUNC
    );
    static final FunctionDescriptor pthread_spin_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_spin_init$MH = RuntimeHelper.downcallHandle(
        "pthread_spin_init",
        constants$370.pthread_spin_init$FUNC
    );
    static final FunctionDescriptor pthread_spin_destroy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_spin_destroy$MH = RuntimeHelper.downcallHandle(
        "pthread_spin_destroy",
        constants$370.pthread_spin_destroy$FUNC
    );
    static final FunctionDescriptor pthread_spin_lock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_spin_lock$MH = RuntimeHelper.downcallHandle(
        "pthread_spin_lock",
        constants$370.pthread_spin_lock$FUNC
    );
    static final FunctionDescriptor pthread_spin_trylock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_spin_trylock$MH = RuntimeHelper.downcallHandle(
        "pthread_spin_trylock",
        constants$370.pthread_spin_trylock$FUNC
    );
    static final FunctionDescriptor pthread_spin_unlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_spin_unlock$MH = RuntimeHelper.downcallHandle(
        "pthread_spin_unlock",
        constants$370.pthread_spin_unlock$FUNC
    );
}


