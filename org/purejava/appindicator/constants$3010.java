// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3010 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3010() {}
    static final VarHandle const$0 = constants$3009.const$1.varHandle(MemoryLayout.PathElement.groupElement("app_exec"));
    static final VarHandle const$1 = constants$3009.const$1.varHandle(MemoryLayout.PathElement.groupElement("groups"));
    static final VarHandle const$2 = constants$3009.const$1.varHandle(MemoryLayout.PathElement.groupElement("is_private"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkRecentManager");
    static final VarHandle const$4 = constants$3010.const$3.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("changed"),
        RuntimeHelper.POINTER.withName("_gtk_recent1"),
        RuntimeHelper.POINTER.withName("_gtk_recent2"),
        RuntimeHelper.POINTER.withName("_gtk_recent3"),
        RuntimeHelper.POINTER.withName("_gtk_recent4")
    ).withName("_GtkRecentManagerClass");
}


