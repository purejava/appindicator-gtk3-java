// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*gtk_action_group_add_radio_actions$on_change)();
 * }
 */
public interface gtk_action_group_add_radio_actions$on_change {

    void apply();
    static MemorySegment allocate(gtk_action_group_add_radio_actions$on_change fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$3270.const$0, fi, constants$7.const$5, scope);
    }
    static gtk_action_group_add_radio_actions$on_change ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return () -> {
            try {
                constants$64.const$1.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


