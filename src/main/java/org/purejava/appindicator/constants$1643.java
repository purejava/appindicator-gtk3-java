// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1643 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1643() {}
    static final VarHandle const$0 = constants$1641.const$4.varHandle(MemoryLayout.PathElement.groupElement("draw_rectangle"));
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_PangoRendererClass.draw_error_underline.class, "apply", constants$1643.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$1643.const$1
    );
    static final VarHandle const$4 = constants$1641.const$4.varHandle(MemoryLayout.PathElement.groupElement("draw_error_underline"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_PangoRendererClass.draw_shape.class, "apply", constants$1043.const$2);
}

