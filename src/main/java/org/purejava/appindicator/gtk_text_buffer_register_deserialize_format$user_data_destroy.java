// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*gtk_text_buffer_register_deserialize_format$user_data_destroy)(void*);
 * }
 */
public interface gtk_text_buffer_register_deserialize_format$user_data_destroy {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(gtk_text_buffer_register_deserialize_format$user_data_destroy fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$3142.const$0, fi, constants$13.const$1, scope);
    }
    static gtk_text_buffer_register_deserialize_format$user_data_destroy ofAddress(MemorySegment addr, Arena arena) {
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

