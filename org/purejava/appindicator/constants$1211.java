// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1211 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1211() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_pollable_input_stream_can_poll",
        constants$10.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_pollable_input_stream_is_readable",
        constants$10.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_pollable_input_stream_create_source",
        constants$5.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_pollable_input_stream_read_nonblocking",
        constants$759.const$4
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("can_poll"),
        RuntimeHelper.POINTER.withName("is_writable"),
        RuntimeHelper.POINTER.withName("create_source"),
        RuntimeHelper.POINTER.withName("write_nonblocking"),
        RuntimeHelper.POINTER.withName("writev_nonblocking")
    ).withName("_GPollableOutputStreamInterface");
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GPollableOutputStreamInterface.can_poll.class, "apply", constants$10.const$5);
}


