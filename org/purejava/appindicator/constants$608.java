// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$608 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$608() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_signal_add_emission_hook$hook_func.class, "apply", constants$11.const$0);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(g_signal_add_emission_hook$data_destroy.class, "apply", constants$13.const$1);
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_signal_add_emission_hook",
        constants$608.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_signal_remove_emission_hook",
        constants$441.const$4
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "g_signal_has_handler_pending",
        constants$608.const$5
    );
}

