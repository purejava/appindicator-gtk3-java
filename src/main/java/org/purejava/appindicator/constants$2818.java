// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2818 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2818() {}
    static final VarHandle const$0 = constants$2817.const$3.varHandle(MemoryLayout.PathElement.groupElement("domain"));
    static final VarHandle const$1 = constants$2817.const$3.varHandle(MemoryLayout.PathElement.groupElement("domain_dirname"));
    static final VarHandle const$2 = constants$2817.const$3.varHandle(MemoryLayout.PathElement.groupElement("default_locales"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    RuntimeHelper.POINTER.withName("g_class")
                ).withName("g_type_instance"),
                JAVA_INT.withName("ref_count"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("qdata")
            ).withName("parent_instance")
        ).withName("object"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkIMContextSimple");
    static final VarHandle const$4 = constants$2818.const$3.varHandle(MemoryLayout.PathElement.groupElement("priv"));
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
            RuntimeHelper.POINTER.withName("preedit_start"),
            RuntimeHelper.POINTER.withName("preedit_end"),
            RuntimeHelper.POINTER.withName("preedit_changed"),
            RuntimeHelper.POINTER.withName("commit"),
            RuntimeHelper.POINTER.withName("retrieve_surrounding"),
            RuntimeHelper.POINTER.withName("delete_surrounding"),
            RuntimeHelper.POINTER.withName("set_client_window"),
            RuntimeHelper.POINTER.withName("get_preedit_string"),
            RuntimeHelper.POINTER.withName("filter_keypress"),
            RuntimeHelper.POINTER.withName("focus_in"),
            RuntimeHelper.POINTER.withName("focus_out"),
            RuntimeHelper.POINTER.withName("reset"),
            RuntimeHelper.POINTER.withName("set_cursor_location"),
            RuntimeHelper.POINTER.withName("set_use_preedit"),
            RuntimeHelper.POINTER.withName("set_surrounding"),
            RuntimeHelper.POINTER.withName("get_surrounding"),
            RuntimeHelper.POINTER.withName("_gtk_reserved1"),
            RuntimeHelper.POINTER.withName("_gtk_reserved2"),
            RuntimeHelper.POINTER.withName("_gtk_reserved3"),
            RuntimeHelper.POINTER.withName("_gtk_reserved4"),
            RuntimeHelper.POINTER.withName("_gtk_reserved5"),
            RuntimeHelper.POINTER.withName("_gtk_reserved6")
        ).withName("parent_class")
    ).withName("_GtkIMContextSimpleClass");
}

