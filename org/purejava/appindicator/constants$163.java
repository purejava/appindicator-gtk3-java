// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$163 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$163() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_bookmark_file_get_groups",
        constants$39.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_bookmark_file_add_application",
        constants$42.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_bookmark_file_has_application",
        constants$34.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_bookmark_file_get_applications",
        constants$39.const$1
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_bookmark_file_set_app_info",
        constants$163.const$4
    );
}

