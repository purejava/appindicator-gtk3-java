// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*gtk_tree_selection_set_select_function$destroy)(void*);
 * }
 */
public interface gtk_tree_selection_set_select_function$destroy {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(gtk_tree_selection_set_select_function$destroy fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$3197.const$3, fi, constants$13.const$1, scope);
    }
    static gtk_tree_selection_set_select_function$destroy ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$13.const$3.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


