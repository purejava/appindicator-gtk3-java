// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$442 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$442() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_slice_get_config",
        constants$173.const$0
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_slice_get_config_state",
        constants$442.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(GSpawnChildSetupFunc.class, "apply", constants$13.const$1);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_spawn_error_quark",
        constants$83.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_spawn_exit_error_quark",
        constants$83.const$1
    );
}


