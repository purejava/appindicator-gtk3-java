// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1404 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1404() {}
    static final VarHandle const$0 = constants$1401.const$0.varHandle(MemoryLayout.PathElement.groupElement("can_eject"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GVolumeIface.mount_fn.class, "apply", constants$380.const$0);
    static final VarHandle const$2 = constants$1401.const$0.varHandle(MemoryLayout.PathElement.groupElement("mount_fn"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GVolumeIface.mount_finish.class, "apply", constants$12.const$2);
    static final VarHandle const$4 = constants$1401.const$0.varHandle(MemoryLayout.PathElement.groupElement("mount_finish"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GVolumeIface.eject.class, "apply", constants$281.const$5);
}


