// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$515 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$515() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "sched_rr_get_interval",
        constants$9.const$2
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(22, JAVA_LONG).withName("__jmpbuf"),
        JAVA_INT.withName("__mask_was_saved"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, JAVA_LONG).withName("__val")
        ).withName("__saved_mask")
    ).withName("__jmp_buf_tag");
    static final VarHandle const$2 = constants$515.const$1.varHandle(MemoryLayout.PathElement.groupElement("__mask_was_saved"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("__routine"),
        RuntimeHelper.POINTER.withName("__arg"),
        JAVA_INT.withName("__canceltype"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("__prev")
    ).withName("_pthread_cleanup_buffer");
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_pthread_cleanup_buffer.__routine.class, "apply", constants$13.const$1);
    static final VarHandle const$5 = constants$515.const$3.varHandle(MemoryLayout.PathElement.groupElement("__routine"));
}


