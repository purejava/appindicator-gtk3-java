// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$375 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$375() {}
    static final FunctionDescriptor g_static_rec_mutex_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rec_mutex_init$MH = RuntimeHelper.downcallHandle(
        "g_static_rec_mutex_init",
        constants$375.g_static_rec_mutex_init$FUNC
    );
    static final FunctionDescriptor g_static_rec_mutex_lock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rec_mutex_lock$MH = RuntimeHelper.downcallHandle(
        "g_static_rec_mutex_lock",
        constants$375.g_static_rec_mutex_lock$FUNC
    );
    static final FunctionDescriptor g_static_rec_mutex_trylock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rec_mutex_trylock$MH = RuntimeHelper.downcallHandle(
        "g_static_rec_mutex_trylock",
        constants$375.g_static_rec_mutex_trylock$FUNC
    );
    static final FunctionDescriptor g_static_rec_mutex_unlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rec_mutex_unlock$MH = RuntimeHelper.downcallHandle(
        "g_static_rec_mutex_unlock",
        constants$375.g_static_rec_mutex_unlock$FUNC
    );
    static final FunctionDescriptor g_static_rec_mutex_lock_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_static_rec_mutex_lock_full$MH = RuntimeHelper.downcallHandle(
        "g_static_rec_mutex_lock_full",
        constants$375.g_static_rec_mutex_lock_full$FUNC
    );
    static final FunctionDescriptor g_static_rec_mutex_unlock_full$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_rec_mutex_unlock_full$MH = RuntimeHelper.downcallHandle(
        "g_static_rec_mutex_unlock_full",
        constants$375.g_static_rec_mutex_unlock_full$FUNC
    );
}


