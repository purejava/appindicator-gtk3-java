// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$401 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$401() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_queue_remove_all",
        constants$9.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_queue_insert_before",
        constants$14.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_queue_insert_before_link",
        constants$14.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_queue_insert_after",
        constants$14.const$3
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_queue_insert_after_link",
        constants$14.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_queue_insert_sorted$func.class, "apply", constants$12.const$2);
}

