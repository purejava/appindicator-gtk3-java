// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$942 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$942() {}
    static final VarHandle const$0 = constants$938.const$2.varHandle(MemoryLayout.PathElement.groupElement("can_eject"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GDriveIface.can_poll_for_media.class, "apply", constants$10.const$5);
    static final VarHandle const$2 = constants$938.const$2.varHandle(MemoryLayout.PathElement.groupElement("can_poll_for_media"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GDriveIface.eject.class, "apply", constants$281.const$5);
    static final VarHandle const$4 = constants$938.const$2.varHandle(MemoryLayout.PathElement.groupElement("eject"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GDriveIface.eject_finish.class, "apply", constants$12.const$2);
}

