// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
final class constants$2835 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2835() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_level_bar_new",
        constants$35.const$2
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_DOUBLE,
        JAVA_DOUBLE
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_level_bar_new_for_interval",
        constants$2835.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_level_bar_set_mode",
        constants$40.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_level_bar_get_mode",
        constants$10.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_level_bar_set_value",
        constants$689.const$5
    );
}

