// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1883 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1883() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_new_subpixbuf",
        constants$1734.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_new_from_file",
        constants$5.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_new_from_file_at_size",
        constants$215.const$2
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_new_from_file_at_scale",
        constants$1883.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_new_from_resource",
        constants$5.const$5
    );
}


