// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$2580 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2580() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
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
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkCellRendererText");
    static final VarHandle const$1 = constants$2580.const$0.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
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
            RuntimeHelper.POINTER.withName("get_request_mode"),
            RuntimeHelper.POINTER.withName("get_preferred_width"),
            RuntimeHelper.POINTER.withName("get_preferred_height_for_width"),
            RuntimeHelper.POINTER.withName("get_preferred_height"),
            RuntimeHelper.POINTER.withName("get_preferred_width_for_height"),
            RuntimeHelper.POINTER.withName("get_aligned_area"),
            RuntimeHelper.POINTER.withName("get_size"),
            RuntimeHelper.POINTER.withName("render"),
            RuntimeHelper.POINTER.withName("activate"),
            RuntimeHelper.POINTER.withName("start_editing"),
            RuntimeHelper.POINTER.withName("editing_canceled"),
            RuntimeHelper.POINTER.withName("editing_started"),
            RuntimeHelper.POINTER.withName("priv"),
            RuntimeHelper.POINTER.withName("_gtk_reserved2"),
            RuntimeHelper.POINTER.withName("_gtk_reserved3"),
            RuntimeHelper.POINTER.withName("_gtk_reserved4")
        ).withName("parent_class"),
        RuntimeHelper.POINTER.withName("edited"),
        RuntimeHelper.POINTER.withName("_gtk_reserved1"),
        RuntimeHelper.POINTER.withName("_gtk_reserved2"),
        RuntimeHelper.POINTER.withName("_gtk_reserved3"),
        RuntimeHelper.POINTER.withName("_gtk_reserved4")
    ).withName("_GtkCellRendererTextClass");
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GtkCellRendererTextClass.edited.class, "apply", constants$14.const$3);
    static final VarHandle const$4 = constants$2580.const$2.varHandle(MemoryLayout.PathElement.groupElement("edited"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GtkCellRendererTextClass._gtk_reserved1.class, "apply", constants$7.const$5);
}

