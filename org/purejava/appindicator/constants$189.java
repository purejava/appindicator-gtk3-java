// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$189 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$189() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_SHORT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_date_set_year",
        constants$189.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_BYTE,
        JAVA_INT,
        JAVA_SHORT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_date_set_dmy",
        constants$189.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_date_set_julian",
        constants$40.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_date_is_first_of_month",
        constants$10.const$5
    );
}

