// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$68 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$68() {}
    static final FunctionDescriptor g_once_init_leave$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_once_init_leave$MH = RuntimeHelper.downcallHandle(
        "g_once_init_leave",
        constants$68.g_once_init_leave$FUNC
    );
    static final FunctionDescriptor g_get_num_processors$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_get_num_processors$MH = RuntimeHelper.downcallHandle(
        "g_get_num_processors",
        constants$68.g_get_num_processors$FUNC
    );
    static final FunctionDescriptor g_async_queue_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_async_queue_new$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_new",
        constants$68.g_async_queue_new$FUNC
    );
    static final FunctionDescriptor g_async_queue_new_full$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_new_full$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_new_full",
        constants$68.g_async_queue_new_full$FUNC
    );
    static final FunctionDescriptor g_async_queue_lock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_lock$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_lock",
        constants$68.g_async_queue_lock$FUNC
    );
    static final FunctionDescriptor g_async_queue_unlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_async_queue_unlock$MH = RuntimeHelper.downcallHandle(
        "g_async_queue_unlock",
        constants$68.g_async_queue_unlock$FUNC
    );
}


