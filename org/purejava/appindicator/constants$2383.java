// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2383 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2383() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_text_iter_backward_search",
        constants$1243.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_text_iter_equal",
        constants$9.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_text_iter_compare",
        constants$9.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_text_iter_in_range",
        constants$12.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_text_iter_order",
        constants$13.const$4
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("target"),
        JAVA_INT.withName("flags"),
        JAVA_INT.withName("info")
    ).withName("_GtkTargetPair");
}

