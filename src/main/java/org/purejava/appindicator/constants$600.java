// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$600 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$600() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(GSignalEmissionHook.class, "apply", constants$11.const$0);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(GSignalAccumulator.class, "apply", constants$34.const$5);
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("signal_id"),
        JAVA_INT.withName("detail"),
        JAVA_INT.withName("run_type")
    ).withName("_GSignalInvocationHint");
    static final VarHandle const$3 = constants$600.const$2.varHandle(MemoryLayout.PathElement.groupElement("signal_id"));
    static final VarHandle const$4 = constants$600.const$2.varHandle(MemoryLayout.PathElement.groupElement("detail"));
    static final VarHandle const$5 = constants$600.const$2.varHandle(MemoryLayout.PathElement.groupElement("run_type"));
}

