// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1103 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1103() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_get_family",
        constants$10.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_get_address",
        constants$5.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_get_length",
        constants$10.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_matches",
        constants$9.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_inet_address_mask_equal",
        constants$9.const$0
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent_instance")
    ).withName("_GSocketAddress");
}

