// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2744 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2744() {}
    static final VarHandle const$0 = constants$2743.const$4.varHandle(MemoryLayout.PathElement.groupElement("render"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GtkGLAreaClass.resize.class, "apply", constants$467.const$3);
    static final VarHandle const$2 = constants$2743.const$4.varHandle(MemoryLayout.PathElement.groupElement("resize"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GtkGLAreaClass.create_context.class, "apply", constants$5.const$2);
    static final VarHandle const$4 = constants$2743.const$4.varHandle(MemoryLayout.PathElement.groupElement("create_context"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_gl_area_get_type",
        constants$3.const$5
    );
}

