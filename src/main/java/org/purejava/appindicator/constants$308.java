// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$308 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$308() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_string_set_size",
        constants$21.const$1
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_string_insert_len",
        constants$308.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_string_append",
        constants$5.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_string_append_len",
        constants$17.const$1
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_BYTE
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "g_string_append_c",
        constants$308.const$5
    );
}


