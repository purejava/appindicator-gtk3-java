// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$195 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$195() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "seekdir",
        constants$25.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "telldir",
        constants$4.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "dirfd",
        constants$10.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(scandir$__selector.class, "apply", constants$10.const$5);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(scandir$__cmp.class, "apply", constants$9.const$0);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "scandir",
        constants$34.const$5
    );
}

