// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$609 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$609() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_signal_connect_closure_by_id",
        constants$609.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_signal_connect_closure",
        constants$609.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_signal_connect_data$c_handler.class, "apply", constants$7.const$5);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_signal_connect_data$destroy_data.class, "apply", constants$13.const$4);
}

