// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$603 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$603() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_signal_new_valist$accumulator.class, "apply", constants$34.const$5);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(g_signal_new_valist$c_marshaller.class, "apply", constants$584.const$3);
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT,
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("__stack"),
            RuntimeHelper.POINTER.withName("__gr_top"),
            RuntimeHelper.POINTER.withName("__vr_top"),
            JAVA_INT.withName("__gr_offs"),
            JAVA_INT.withName("__vr_offs")
        ).withName("__va_list")
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_signal_new_valist",
        constants$603.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_signal_new$accumulator.class, "apply", constants$34.const$5);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_signal_new$c_marshaller.class, "apply", constants$584.const$3);
}

