// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$320 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$320() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_io_channel_write",
        constants$27.const$2
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_io_channel_seek",
        constants$320.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_io_channel_close",
        constants$13.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_io_channel_shutdown",
        constants$150.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_io_add_watch_full$func.class, "apply", constants$150.const$0);
}


