// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$956 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$956() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GDtlsConnectionInterface.handshake_async.class, "apply", constants$281.const$5);
    static final VarHandle const$1 = constants$955.const$0.varHandle(MemoryLayout.PathElement.groupElement("handshake_async"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GDtlsConnectionInterface.handshake_finish.class, "apply", constants$12.const$2);
    static final VarHandle const$3 = constants$955.const$0.varHandle(MemoryLayout.PathElement.groupElement("handshake_finish"));
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GDtlsConnectionInterface.shutdown.class, "apply", constants$956.const$4);
}


