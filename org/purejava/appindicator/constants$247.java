// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$247 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$247() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_hostname_to_unicode",
        constants$5.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(GPollFunc.class, "apply", constants$49.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$49.const$0
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("fd"),
        JAVA_SHORT.withName("events"),
        JAVA_SHORT.withName("revents")
    ).withName("_GPollFD");
    static final VarHandle const$4 = constants$247.const$3.varHandle(MemoryLayout.PathElement.groupElement("fd"));
    static final VarHandle const$5 = constants$247.const$3.varHandle(MemoryLayout.PathElement.groupElement("events"));
}

