// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$3125 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3125() {}
    static final VarHandle const$0 = constants$3124.const$0.varHandle(MemoryLayout.PathElement.groupElement("insert_child_anchor"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GtkTextBufferClass.delete_range.class, "apply", constants$14.const$3);
    static final VarHandle const$2 = constants$3124.const$0.varHandle(MemoryLayout.PathElement.groupElement("delete_range"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GtkTextBufferClass.changed.class, "apply", constants$13.const$1);
    static final VarHandle const$4 = constants$3124.const$0.varHandle(MemoryLayout.PathElement.groupElement("changed"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GtkTextBufferClass.modified_changed.class, "apply", constants$13.const$1);
}

