// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$372 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$372() {}
    static final FunctionDescriptor pthread_barrierattr_setpshared$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_barrierattr_setpshared$MH = RuntimeHelper.downcallHandle(
        "pthread_barrierattr_setpshared",
        constants$372.pthread_barrierattr_setpshared$FUNC
    );
    static final FunctionDescriptor pthread_key_create$__destr_function$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor pthread_key_create$__destr_function_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_key_create$__destr_function_UP$MH = RuntimeHelper.upcallHandle(pthread_key_create$__destr_function.class, "apply", constants$372.pthread_key_create$__destr_function_UP$FUNC);
    static final FunctionDescriptor pthread_key_create$__destr_function_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_key_create$__destr_function_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$372.pthread_key_create$__destr_function_DOWN$FUNC
    );
    static final FunctionDescriptor pthread_key_create$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_key_create$MH = RuntimeHelper.downcallHandle(
        "pthread_key_create",
        constants$372.pthread_key_create$FUNC
    );
    static final FunctionDescriptor pthread_key_delete$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_key_delete$MH = RuntimeHelper.downcallHandle(
        "pthread_key_delete",
        constants$372.pthread_key_delete$FUNC
    );
    static final FunctionDescriptor pthread_getspecific$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_getspecific$MH = RuntimeHelper.downcallHandle(
        "pthread_getspecific",
        constants$372.pthread_getspecific$FUNC
    );
}


