// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$362 {

    static final FunctionDescriptor pthread_rwlock_tryrdlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_tryrdlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_tryrdlock",
        constants$362.pthread_rwlock_tryrdlock$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_timedrdlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_timedrdlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_timedrdlock",
        constants$362.pthread_rwlock_timedrdlock$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_wrlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_wrlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_wrlock",
        constants$362.pthread_rwlock_wrlock$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_trywrlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_trywrlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_trywrlock",
        constants$362.pthread_rwlock_trywrlock$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_timedwrlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_timedwrlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_timedwrlock",
        constants$362.pthread_rwlock_timedwrlock$FUNC
    );
    static final FunctionDescriptor pthread_rwlock_unlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlock_unlock$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlock_unlock",
        constants$362.pthread_rwlock_unlock$FUNC
    );
}


