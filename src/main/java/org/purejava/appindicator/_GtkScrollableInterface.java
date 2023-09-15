// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkScrollableInterface {
 *     struct _GTypeInterface base_iface;
 *     int (*get_border)(struct _GtkScrollable*,struct _GtkBorder*);
 * };
 * }
 */
public class _GtkScrollableInterface {

    public static MemoryLayout $LAYOUT() {
        return constants$3056.const$5;
    }
    public static MemorySegment base_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    /**
     * {@snippet :
 * int (*get_border)(struct _GtkScrollable*,struct _GtkBorder*);
     * }
     */
    public interface get_border {

        int apply(java.lang.foreign.MemorySegment filter_info, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_border fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3057.const$0, fi, constants$9.const$0, scope);
        }
        static get_border ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _filter_info, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$12.const$1.invokeExact(symbol, _filter_info, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_border$VH() {
        return constants$3057.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*get_border)(struct _GtkScrollable*,struct _GtkBorder*);
     * }
     */
    public static MemorySegment get_border$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3057.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*get_border)(struct _GtkScrollable*,struct _GtkBorder*);
     * }
     */
    public static void get_border$set(MemorySegment seg, MemorySegment x) {
        constants$3057.const$1.set(seg, x);
    }
    public static MemorySegment get_border$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3057.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void get_border$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3057.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_border get_border(MemorySegment segment, Arena scope) {
        return get_border.ofAddress(get_border$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


