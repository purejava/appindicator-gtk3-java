// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$126 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$126() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "sigemptyset",
        constants$10.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "sigfillset",
        constants$10.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "sigaddset",
        constants$11.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "sigdelset",
        constants$11.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "sigismember",
        constants$11.const$4
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            RuntimeHelper.POINTER.withName("sa_handler"),
            RuntimeHelper.POINTER.withName("sa_sigaction")
        ).withName("__sigaction_handler"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, JAVA_LONG).withName("__val")
        ).withName("sa_mask"),
        JAVA_INT.withName("sa_flags"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("sa_restorer")
    ).withName("sigaction");
}


