// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1143 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1143() {}
    static final VarHandle const$0 = constants$1141.const$2.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(GReallocFunc.class, "apply", constants$21.const$1);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_memory_output_stream_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_memory_output_stream_new$realloc_function.class, "apply", constants$21.const$1);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_memory_output_stream_new$destroy_function.class, "apply", constants$13.const$1);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_memory_output_stream_new",
        constants$169.const$4
    );
}

