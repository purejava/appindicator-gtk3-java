// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$816 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$816() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "sleep",
        constants$8.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "ualarm",
        constants$123.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "usleep",
        constants$8.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "pause",
        constants$83.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "chown",
        constants$49.const$0
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "fchown",
        constants$816.const$5
    );
}

