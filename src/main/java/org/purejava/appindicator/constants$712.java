// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$712 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$712() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("lookup_action"),
        RuntimeHelper.POINTER.withName("add_action"),
        RuntimeHelper.POINTER.withName("remove_action")
    ).withName("_GActionMapInterface");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GActionMapInterface.lookup_action.class, "apply", constants$5.const$5);
    static final VarHandle const$2 = constants$712.const$0.varHandle(MemoryLayout.PathElement.groupElement("lookup_action"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GActionMapInterface.add_action.class, "apply", constants$13.const$4);
    static final VarHandle const$4 = constants$712.const$0.varHandle(MemoryLayout.PathElement.groupElement("add_action"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GActionMapInterface.remove_action.class, "apply", constants$13.const$4);
}

