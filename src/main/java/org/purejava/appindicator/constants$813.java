// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$813 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$813() {}
    static final VarHandle const$0 = constants$811.const$2.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_converter_output_stream_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_converter_output_stream_new",
        constants$5.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_converter_output_stream_get_converter",
        constants$5.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "access",
        constants$11.const$4
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "faccessat",
        constants$813.const$5
    );
}


