// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$1223 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1223() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_socket_address_enumerator_next_async",
        constants$42.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_socket_address_enumerator_next_finish",
        constants$23.const$0
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    RuntimeHelper.POINTER.withName("g_class")
                ).withName("g_type_instance"),
                JAVA_INT.withName("ref_count"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("qdata")
            ).withName("parent_instance")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GProxyAddressEnumerator");
    static final VarHandle const$3 = constants$1223.const$2.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    JAVA_LONG.withName("g_type")
                ).withName("g_type_class"),
                RuntimeHelper.POINTER.withName("construct_properties"),
                RuntimeHelper.POINTER.withName("constructor"),
                RuntimeHelper.POINTER.withName("set_property"),
                RuntimeHelper.POINTER.withName("get_property"),
                RuntimeHelper.POINTER.withName("dispose"),
                RuntimeHelper.POINTER.withName("finalize"),
                RuntimeHelper.POINTER.withName("dispatch_properties_changed"),
                RuntimeHelper.POINTER.withName("notify"),
                RuntimeHelper.POINTER.withName("constructed"),
                JAVA_LONG.withName("flags"),
                JAVA_LONG.withName("n_construct_properties"),
                RuntimeHelper.POINTER.withName("pspecs"),
                JAVA_LONG.withName("n_pspecs"),
                MemoryLayout.sequenceLayout(3, RuntimeHelper.POINTER).withName("pdummy")
            ).withName("parent_class"),
            RuntimeHelper.POINTER.withName("next"),
            RuntimeHelper.POINTER.withName("next_async"),
            RuntimeHelper.POINTER.withName("next_finish")
        ).withName("parent_class"),
        RuntimeHelper.POINTER.withName("_g_reserved1"),
        RuntimeHelper.POINTER.withName("_g_reserved2"),
        RuntimeHelper.POINTER.withName("_g_reserved3"),
        RuntimeHelper.POINTER.withName("_g_reserved4"),
        RuntimeHelper.POINTER.withName("_g_reserved5"),
        RuntimeHelper.POINTER.withName("_g_reserved6"),
        RuntimeHelper.POINTER.withName("_g_reserved7")
    ).withName("_GProxyAddressEnumeratorClass");
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GProxyAddressEnumeratorClass._g_reserved1.class, "apply", constants$7.const$5);
}

