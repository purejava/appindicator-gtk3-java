// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$587 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$587() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(8),
            RuntimeHelper.POINTER.withName("marshal"),
            RuntimeHelper.POINTER.withName("data"),
            RuntimeHelper.POINTER.withName("notifiers")
        ).withName("closure"),
        RuntimeHelper.POINTER.withName("callback")
    ).withName("_GCClosure");
    static final VarHandle const$1 = constants$587.const$0.varHandle(MemoryLayout.PathElement.groupElement("callback"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(g_cclosure_new$callback_func.class, "apply", constants$7.const$5);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_cclosure_new$destroy_data.class, "apply", constants$13.const$4);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_cclosure_new",
        constants$23.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_cclosure_new_swap$callback_func.class, "apply", constants$7.const$5);
}

