// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1227 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1227() {}
    static final VarHandle const$0 = constants$1226.const$2.varHandle(MemoryLayout.PathElement.groupElement("lookup"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GProxyResolverInterface.lookup_async.class, "apply", constants$331.const$1);
    static final VarHandle const$2 = constants$1226.const$2.varHandle(MemoryLayout.PathElement.groupElement("lookup_async"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GProxyResolverInterface.lookup_finish.class, "apply", constants$23.const$0);
    static final VarHandle const$4 = constants$1226.const$2.varHandle(MemoryLayout.PathElement.groupElement("lookup_finish"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_proxy_resolver_get_type",
        constants$3.const$5
    );
}

