// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1174 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1174() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GMountOperation");
    static final VarHandle const$1 = constants$1174.const$0.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("ask_password"),
        RuntimeHelper.POINTER.withName("ask_question"),
        RuntimeHelper.POINTER.withName("reply"),
        RuntimeHelper.POINTER.withName("aborted"),
        RuntimeHelper.POINTER.withName("show_processes"),
        RuntimeHelper.POINTER.withName("show_unmount_progress"),
        RuntimeHelper.POINTER.withName("_g_reserved1"),
        RuntimeHelper.POINTER.withName("_g_reserved2"),
        RuntimeHelper.POINTER.withName("_g_reserved3"),
        RuntimeHelper.POINTER.withName("_g_reserved4"),
        RuntimeHelper.POINTER.withName("_g_reserved5"),
        RuntimeHelper.POINTER.withName("_g_reserved6"),
        RuntimeHelper.POINTER.withName("_g_reserved7"),
        RuntimeHelper.POINTER.withName("_g_reserved8"),
        RuntimeHelper.POINTER.withName("_g_reserved9")
    ).withName("_GMountOperationClass");
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GMountOperationClass.ask_password.class, "apply", constants$646.const$4);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$646.const$4
    );
    static final VarHandle const$5 = constants$1174.const$2.varHandle(MemoryLayout.PathElement.groupElement("ask_password"));
}

