// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GTlsClientConnectionInterface {
 *     GTypeInterface g_iface;
 *     void (*copy_session_state)(GTlsClientConnection*,GTlsClientConnection*);
 * };
 * }
 */
public class _GTlsClientConnectionInterface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("copy_session_state")
    ).withName("_GTlsClientConnectionInterface");
    public static MemoryLayout $LAYOUT() {
        return _GTlsClientConnectionInterface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor copy_session_state$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor copy_session_state_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle copy_session_state_UP$MH = RuntimeHelper.upcallHandle(copy_session_state.class, "apply", _GTlsClientConnectionInterface.copy_session_state_UP$FUNC);
    static final FunctionDescriptor copy_session_state_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle copy_session_state_DOWN$MH = RuntimeHelper.downcallHandle(
        _GTlsClientConnectionInterface.copy_session_state_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*copy_session_state)(GTlsClientConnection*,GTlsClientConnection*);
     * }
     */
    public interface copy_session_state {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(copy_session_state fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GTlsClientConnectionInterface.copy_session_state_UP$MH, fi, _GTlsClientConnectionInterface.copy_session_state$FUNC, scope);
        }
        static copy_session_state ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    _GTlsClientConnectionInterface.copy_session_state_DOWN$MH.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle copy_session_state$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("copy_session_state"));
    public static VarHandle copy_session_state$VH() {
        return _GTlsClientConnectionInterface.copy_session_state$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*copy_session_state)(GTlsClientConnection*,GTlsClientConnection*);
     * }
     */
    public static MemorySegment copy_session_state$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GTlsClientConnectionInterface.copy_session_state$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*copy_session_state)(GTlsClientConnection*,GTlsClientConnection*);
     * }
     */
    public static void copy_session_state$set(MemorySegment seg, MemorySegment x) {
        _GTlsClientConnectionInterface.copy_session_state$VH.set(seg, x);
    }
    public static MemorySegment copy_session_state$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GTlsClientConnectionInterface.copy_session_state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void copy_session_state$set(MemorySegment seg, long index, MemorySegment x) {
        _GTlsClientConnectionInterface.copy_session_state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static copy_session_state copy_session_state(MemorySegment segment, SegmentScope scope) {
        return copy_session_state.ofAddress(copy_session_state$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


