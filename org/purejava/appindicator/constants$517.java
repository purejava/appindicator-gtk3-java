// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$517 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$517() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "pthread_join",
        constants$87.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "pthread_detach",
        constants$26.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "pthread_self",
        constants$3.const$5
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "pthread_equal",
        constants$517.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "pthread_attr_init",
        constants$10.const$5
    );
}


