// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$729 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$729() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_app_info_get_fallback_for_type",
        constants$5.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_app_info_reset_type_associations",
        constants$13.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_app_info_get_default_for_type",
        constants$21.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_app_info_get_default_for_type_async$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_app_info_get_default_for_type_async",
        constants$281.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_app_info_get_default_for_type_finish",
        constants$5.const$5
    );
}


