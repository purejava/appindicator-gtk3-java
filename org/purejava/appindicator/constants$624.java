// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$624 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$624() {}
    static final VarHandle const$0 = constants$622.const$5.varHandle(MemoryLayout.PathElement.groupElement("set_property"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GObjectClass.get_property.class, "apply", constants$179.const$1);
    static final VarHandle const$2 = constants$622.const$5.varHandle(MemoryLayout.PathElement.groupElement("get_property"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GObjectClass.dispose.class, "apply", constants$13.const$1);
    static final VarHandle const$4 = constants$622.const$5.varHandle(MemoryLayout.PathElement.groupElement("dispose"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GObjectClass.finalize.class, "apply", constants$13.const$1);
}


