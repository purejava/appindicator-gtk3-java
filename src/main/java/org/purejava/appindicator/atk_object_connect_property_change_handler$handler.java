// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*atk_object_connect_property_change_handler$handler)(struct _AtkObject*,struct _AtkPropertyValues*);
 * }
 */
public interface atk_object_connect_property_change_handler$handler {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(atk_object_connect_property_change_handler$handler fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1979.const$4, fi, constants$13.const$4, scope);
    }
    static atk_object_connect_property_change_handler$handler ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$14.const$0.invokeExact(symbol, _tag, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


