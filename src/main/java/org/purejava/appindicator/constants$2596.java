// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$2596 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2596() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GtkCellRendererSpinnerClass._gtk_reserved4.class, "apply", constants$7.const$5);
    static final VarHandle const$1 = constants$2594.const$5.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_cell_renderer_spinner_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_cell_renderer_spinner_new",
        constants$35.const$2
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
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
    ).withName("_GtkCellRendererToggle");
    static final VarHandle const$5 = constants$2596.const$4.varHandle(MemoryLayout.PathElement.groupElement("priv"));
}

