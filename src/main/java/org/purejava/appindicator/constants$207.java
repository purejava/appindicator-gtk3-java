// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$207 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$207() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_aligned_alloc",
        constants$207.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_aligned_alloc0",
        constants$207.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_aligned_free",
        constants$13.const$1
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_aligned_free_sized",
        constants$207.const$4
    );
}


