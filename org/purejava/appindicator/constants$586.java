// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$586 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$586() {}
    static final VarHandle const$0 = constants$585.const$3.varHandle(MemoryLayout.PathElement.groupElement("notify"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(8),
        RuntimeHelper.POINTER.withName("marshal"),
        RuntimeHelper.POINTER.withName("data"),
        RuntimeHelper.POINTER.withName("notifiers")
    ).withName("_GClosure");
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GClosure.marshal.class, "apply", constants$584.const$3);
    static final VarHandle const$3 = constants$586.const$1.varHandle(MemoryLayout.PathElement.groupElement("marshal"));
    static final VarHandle const$4 = constants$586.const$1.varHandle(MemoryLayout.PathElement.groupElement("data"));
    static final VarHandle const$5 = constants$586.const$1.varHandle(MemoryLayout.PathElement.groupElement("notifiers"));
}

