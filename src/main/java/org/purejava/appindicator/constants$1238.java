// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
final class constants$1238 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1238() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_resolver_free_addresses",
        constants$13.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_resolver_lookup_by_address",
        constants$39.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(g_resolver_lookup_by_address_async$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_resolver_lookup_by_address_async",
        constants$331.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_resolver_lookup_by_address_finish",
        constants$23.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_resolver_lookup_service",
        constants$334.const$2
    );
}

