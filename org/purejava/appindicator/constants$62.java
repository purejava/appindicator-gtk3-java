// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$62 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$62() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_parse_debug_string",
        constants$62.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandleVariadic(
        "g_snprintf",
        constants$62.const$2
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("__stack"),
            RuntimeHelper.POINTER.withName("__gr_top"),
            RuntimeHelper.POINTER.withName("__vr_top"),
            JAVA_INT.withName("__gr_offs"),
            JAVA_INT.withName("__vr_offs")
        ).withName("__va_list")
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_vsnprintf",
        constants$62.const$4
    );
}

