// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$560 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$560() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_type_register_static",
        constants$560.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(g_type_register_static_simple$class_init.class, "apply", constants$13.const$4);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_type_register_static_simple$instance_init.class, "apply", constants$13.const$4);
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_type_register_static_simple",
        constants$560.const$4
    );
}


