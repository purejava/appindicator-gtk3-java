// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$625 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$625() {}
    static final VarHandle const$0 = constants$622.const$5.varHandle(MemoryLayout.PathElement.groupElement("finalize"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GObjectClass.dispatch_properties_changed.class, "apply", constants$42.const$4);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$42.const$4
    );
    static final VarHandle const$3 = constants$622.const$5.varHandle(MemoryLayout.PathElement.groupElement("dispatch_properties_changed"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GObjectClass.notify.class, "apply", constants$13.const$4);
    static final VarHandle const$5 = constants$622.const$5.varHandle(MemoryLayout.PathElement.groupElement("notify"));
}


