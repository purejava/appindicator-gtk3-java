// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$119 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$119() {}
    static final VarHandle const$0 = constants$118.const$5.varHandle(MemoryLayout.PathElement.groupElement("_lower"));
    static final VarHandle const$1 = constants$118.const$5.varHandle(MemoryLayout.PathElement.groupElement("_upper"));
    static final VarHandle const$2 = constants$118.const$4.varHandle(MemoryLayout.PathElement.groupElement("_pkey"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_LONG.withName("si_band"),
        JAVA_INT.withName("si_fd"),
        MemoryLayout.paddingLayout(4)
    ).withName("");
    static final VarHandle const$4 = constants$119.const$3.varHandle(MemoryLayout.PathElement.groupElement("si_band"));
    static final VarHandle const$5 = constants$119.const$3.varHandle(MemoryLayout.PathElement.groupElement("si_fd"));
}


