// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkLevelBarClass {
 *     struct _GtkWidgetClass parent_class;
 *     void (*offset_changed)(struct _GtkLevelBar*,char*);
 *     void* padding[16];
 * };
 * }
 */
public class _GtkLevelBarClass {

    public static MemoryLayout $LAYOUT() {
        return constants$2834.const$2;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 824);
    }
    /**
     * {@snippet :
 * void (*offset_changed)(struct _GtkLevelBar*,char*);
     * }
     */
    public interface offset_changed {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(offset_changed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2834.const$3, fi, constants$13.const$4, scope);
        }
        static offset_changed ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle offset_changed$VH() {
        return constants$2834.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*offset_changed)(struct _GtkLevelBar*,char*);
     * }
     */
    public static MemorySegment offset_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2834.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*offset_changed)(struct _GtkLevelBar*,char*);
     * }
     */
    public static void offset_changed$set(MemorySegment seg, MemorySegment x) {
        constants$2834.const$4.set(seg, x);
    }
    public static MemorySegment offset_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2834.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void offset_changed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2834.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static offset_changed offset_changed(MemorySegment segment, Arena scope) {
        return offset_changed.ofAddress(offset_changed$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(832, 128);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

