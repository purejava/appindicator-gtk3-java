// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GThreadPool {
 *     void (*func)(void*,void*);
 *     void* user_data;
 *     int exclusive;
 * };
 * }
 */
public class _GThreadPool {

    public static MemoryLayout $LAYOUT() {
        return constants$465.const$3;
    }
    /**
     * {@snippet :
 * void (*func)(void*,void*);
     * }
     */
    public interface func {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(func fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$465.const$4, fi, constants$13.const$4, scope);
        }
        static func ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle func$VH() {
        return constants$465.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*func)(void*,void*);
     * }
     */
    public static MemorySegment func$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$465.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*func)(void*,void*);
     * }
     */
    public static void func$set(MemorySegment seg, MemorySegment x) {
        constants$465.const$5.set(seg, x);
    }
    public static MemorySegment func$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$465.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void func$set(MemorySegment seg, long index, MemorySegment x) {
        constants$465.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static func func(MemorySegment segment, Arena scope) {
        return func.ofAddress(func$get(segment), scope);
    }
    public static VarHandle user_data$VH() {
        return constants$466.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* user_data;
     * }
     */
    public static MemorySegment user_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$466.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* user_data;
     * }
     */
    public static void user_data$set(MemorySegment seg, MemorySegment x) {
        constants$466.const$0.set(seg, x);
    }
    public static MemorySegment user_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$466.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void user_data$set(MemorySegment seg, long index, MemorySegment x) {
        constants$466.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle exclusive$VH() {
        return constants$466.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int exclusive;
     * }
     */
    public static int exclusive$get(MemorySegment seg) {
        return (int)constants$466.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int exclusive;
     * }
     */
    public static void exclusive$set(MemorySegment seg, int x) {
        constants$466.const$1.set(seg, x);
    }
    public static int exclusive$get(MemorySegment seg, long index) {
        return (int)constants$466.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void exclusive$set(MemorySegment seg, long index, int x) {
        constants$466.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


