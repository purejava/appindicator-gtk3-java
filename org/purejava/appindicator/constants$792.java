// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$792 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$792() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_output_stream_has_pending",
        constants$10.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_output_stream_set_pending",
        constants$9.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_output_stream_clear_pending",
        constants$13.const$1
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    RuntimeHelper.POINTER.withName("g_class")
                ).withName("g_type_instance"),
                JAVA_INT.withName("ref_count"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("qdata")
            ).withName("parent_instance"),
            RuntimeHelper.POINTER.withName("priv")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("base_stream")
    ).withName("_GFilterOutputStream");
    static final VarHandle const$4 = constants$792.const$3.varHandle(MemoryLayout.PathElement.groupElement("base_stream"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
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
            RuntimeHelper.POINTER.withName("write_fn"),
            RuntimeHelper.POINTER.withName("splice"),
            RuntimeHelper.POINTER.withName("flush"),
            RuntimeHelper.POINTER.withName("close_fn"),
            RuntimeHelper.POINTER.withName("write_async"),
            RuntimeHelper.POINTER.withName("write_finish"),
            RuntimeHelper.POINTER.withName("splice_async"),
            RuntimeHelper.POINTER.withName("splice_finish"),
            RuntimeHelper.POINTER.withName("flush_async"),
            RuntimeHelper.POINTER.withName("flush_finish"),
            RuntimeHelper.POINTER.withName("close_async"),
            RuntimeHelper.POINTER.withName("close_finish"),
            RuntimeHelper.POINTER.withName("writev_fn"),
            RuntimeHelper.POINTER.withName("writev_async"),
            RuntimeHelper.POINTER.withName("writev_finish"),
            RuntimeHelper.POINTER.withName("_g_reserved4"),
            RuntimeHelper.POINTER.withName("_g_reserved5"),
            RuntimeHelper.POINTER.withName("_g_reserved6"),
            RuntimeHelper.POINTER.withName("_g_reserved7"),
            RuntimeHelper.POINTER.withName("_g_reserved8")
        ).withName("parent_class"),
        RuntimeHelper.POINTER.withName("_g_reserved1"),
        RuntimeHelper.POINTER.withName("_g_reserved2"),
        RuntimeHelper.POINTER.withName("_g_reserved3")
    ).withName("_GFilterOutputStreamClass");
}


