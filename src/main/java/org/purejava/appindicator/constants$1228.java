// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1228 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1228() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_proxy_resolver_get_default",
        constants$35.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_proxy_resolver_is_supported",
        constants$10.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_proxy_resolver_lookup",
        constants$39.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_proxy_resolver_lookup_async$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_proxy_resolver_lookup_async",
        constants$331.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_proxy_resolver_lookup_finish",
        constants$23.const$0
    );
}


