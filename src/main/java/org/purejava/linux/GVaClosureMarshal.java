// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GVaClosureMarshal {

    void apply(java.lang.foreign.MemoryAddress closure, java.lang.foreign.MemoryAddress return_value, java.lang.foreign.MemoryAddress instance, java.lang.foreign.MemoryAddress args, java.lang.foreign.MemoryAddress marshal_data, int n_params, java.lang.foreign.MemoryAddress param_types);
    static MemorySegment allocate(GVaClosureMarshal fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GVaClosureMarshal.class, fi, constants$442.GVaClosureMarshal$FUNC, session);
    }
    static GVaClosureMarshal ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _closure, java.lang.foreign.MemoryAddress _return_value, java.lang.foreign.MemoryAddress _instance, java.lang.foreign.MemoryAddress _args, java.lang.foreign.MemoryAddress _marshal_data, int _n_params, java.lang.foreign.MemoryAddress _param_types) -> {
            try {
                constants$443.GVaClosureMarshal$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_closure, (java.lang.foreign.Addressable)_return_value, (java.lang.foreign.Addressable)_instance, (java.lang.foreign.Addressable)_args, (java.lang.foreign.Addressable)_marshal_data, _n_params, (java.lang.foreign.Addressable)_param_types);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

