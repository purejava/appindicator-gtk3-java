// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$1244 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1244() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_resources_enumerate_children",
        constants$196.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_resources_get_info",
        constants$373.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_static_resource_init",
        constants$13.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_static_resource_fini",
        constants$13.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_static_resource_get_resource",
        constants$5.const$2
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("tell"),
        RuntimeHelper.POINTER.withName("can_seek"),
        RuntimeHelper.POINTER.withName("seek"),
        RuntimeHelper.POINTER.withName("can_truncate"),
        RuntimeHelper.POINTER.withName("truncate_fn")
    ).withName("_GSeekableIface");
}

