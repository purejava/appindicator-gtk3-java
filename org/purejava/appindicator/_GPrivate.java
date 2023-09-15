// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GPrivate {
 *     void* p;
 *     void (*notify)(void*);
 *     void* future[2];
 * };
 * }
 */
public class _GPrivate {

    public static MemoryLayout $LAYOUT() {
        return constants$100.const$3;
    }
    public static VarHandle p$VH() {
        return constants$100.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* p;
     * }
     */
    public static MemorySegment p$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$100.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* p;
     * }
     */
    public static void p$set(MemorySegment seg, MemorySegment x) {
        constants$100.const$4.set(seg, x);
    }
    public static MemorySegment p$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$100.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void p$set(MemorySegment seg, long index, MemorySegment x) {
        constants$100.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * void (*notify)(void*);
     * }
     */
    public interface notify {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(notify fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$100.const$5, fi, constants$13.const$1, scope);
        }
        static notify ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle notify$VH() {
        return constants$101.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*notify)(void*);
     * }
     */
    public static MemorySegment notify$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$101.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*notify)(void*);
     * }
     */
    public static void notify$set(MemorySegment seg, MemorySegment x) {
        constants$101.const$0.set(seg, x);
    }
    public static MemorySegment notify$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$101.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void notify$set(MemorySegment seg, long index, MemorySegment x) {
        constants$101.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static notify notify(MemorySegment segment, Arena scope) {
        return notify.ofAddress(notify$get(segment), scope);
    }
    public static MemorySegment future$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


