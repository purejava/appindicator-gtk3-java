// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$363 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$363() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, JAVA_LONG).withName("x")
    ).withName("_GVariantIter");
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_variant_iter_new",
        constants$5.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_variant_iter_init",
        constants$22.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_variant_iter_copy",
        constants$5.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_variant_iter_n_children",
        constants$4.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_variant_iter_free",
        constants$13.const$1
    );
}

