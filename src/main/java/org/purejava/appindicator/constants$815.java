// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$815 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$815() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "write",
        constants$814.const$4
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "pread",
        constants$815.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "pwrite",
        constants$815.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "pipe",
        constants$10.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "alarm",
        constants$8.const$4
    );
}

