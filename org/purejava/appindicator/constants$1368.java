// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1368 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1368() {}
    static final VarHandle const$0 = constants$1364.const$2.varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle_finish"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GTlsDatabaseClass.lookup_certificate_issuer.class, "apply", constants$1366.const$3);
    static final VarHandle const$2 = constants$1364.const$2.varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GTlsDatabaseClass.lookup_certificate_issuer_async.class, "apply", constants$1367.const$1);
    static final VarHandle const$4 = constants$1364.const$2.varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer_async"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GTlsDatabaseClass.lookup_certificate_issuer_finish.class, "apply", constants$23.const$0);
}

