// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$245 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$245() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_hook_next_valid",
        constants$32.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_hook_compare_ids",
        constants$9.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_hook_list_invoke",
        constants$40.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_hook_list_invoke_check",
        constants$40.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_hook_list_marshal$marshaller.class, "apply", constants$13.const$4);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_hook_list_marshal",
        constants$179.const$1
    );
}

