// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GtkAccelMapForeach {

    void apply(java.lang.foreign.MemoryAddress data, java.lang.foreign.MemoryAddress accel_path, int accel_key, int accel_mods, int changed);
    static MemorySegment allocate(GtkAccelMapForeach fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GtkAccelMapForeach.class, fi, constants$1535.GtkAccelMapForeach$FUNC, session);
    }
    static GtkAccelMapForeach ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _data, java.lang.foreign.MemoryAddress _accel_path, int _accel_key, int _accel_mods, int _changed) -> {
            try {
                constants$1535.GtkAccelMapForeach$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_data, (java.lang.foreign.Addressable)_accel_path, _accel_key, _accel_mods, _changed);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

