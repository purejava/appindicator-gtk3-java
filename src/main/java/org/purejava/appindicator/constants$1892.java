// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1892 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1892() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_DOUBLE,
        JAVA_DOUBLE,
        JAVA_DOUBLE,
        JAVA_DOUBLE,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_composite_color",
        constants$1892.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_scale_simple",
        constants$1723.const$2
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_composite_color_simple",
        constants$1892.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_rotate_simple",
        constants$21.const$3
    );
}


