// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$231 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$231() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_hash_table_foreach",
        constants$14.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(g_hash_table_find$predicate.class, "apply", constants$12.const$2);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_hash_table_find",
        constants$23.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_hash_table_foreach_remove$func.class, "apply", constants$12.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_hash_table_foreach_remove",
        constants$12.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_hash_table_foreach_steal$func.class, "apply", constants$12.const$2);
}


