// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2928 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2928() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_paper_size_new_from_ipp",
        constants$1821.const$0
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_DOUBLE,
        JAVA_DOUBLE,
        JAVA_INT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_paper_size_new_custom",
        constants$2928.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_paper_size_copy",
        constants$5.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_paper_size_free",
        constants$13.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_paper_size_is_equal",
        constants$9.const$0
    );
}


