// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$778 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$778() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
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
    ).withName("_GOutputStreamClass");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GOutputStreamClass.write_fn.class, "apply", constants$759.const$4);
    static final VarHandle const$2 = constants$778.const$0.varHandle(MemoryLayout.PathElement.groupElement("write_fn"));
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GOutputStreamClass.splice.class, "apply", constants$778.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$778.const$3
    );
}


