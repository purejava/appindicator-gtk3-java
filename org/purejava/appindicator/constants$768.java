// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$768 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$768() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_input_stream_read_bytes_async",
        constants$762.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_input_stream_read_bytes_finish",
        constants$23.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(g_input_stream_skip_async$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_input_stream_skip_async",
        constants$762.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_input_stream_skip_finish",
        constants$166.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_input_stream_close_async$callback.class, "apply", constants$14.const$3);
}


