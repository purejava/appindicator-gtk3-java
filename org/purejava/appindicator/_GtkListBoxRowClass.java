// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkListBoxRowClass {
 *     struct _GtkBinClass parent_class;
 *     void (*activate)(struct _GtkListBoxRow*);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 * };
 * }
 */
public class _GtkListBoxRowClass {

    public static MemoryLayout $LAYOUT() {
        return constants$2845.const$2;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 1008);
    }
    /**
     * {@snippet :
 * void (*activate)(struct _GtkListBoxRow*);
     * }
     */
    public interface activate {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(activate fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2845.const$3, fi, constants$13.const$1, scope);
        }
        static activate ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle activate$VH() {
        return constants$2845.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*activate)(struct _GtkListBoxRow*);
     * }
     */
    public static MemorySegment activate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2845.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*activate)(struct _GtkListBoxRow*);
     * }
     */
    public static void activate$set(MemorySegment seg, MemorySegment x) {
        constants$2845.const$4.set(seg, x);
    }
    public static MemorySegment activate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2845.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void activate$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2845.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate activate(MemorySegment segment, Arena scope) {
        return activate.ofAddress(activate$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2845.const$5, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved1 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved1$VH() {
        return constants$2846.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2846.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$2846.const$0.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2846.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2846.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1(MemorySegment segment, Arena scope) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved2)();
     * }
     */
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2846.const$1, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved2 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved2$VH() {
        return constants$2846.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2846.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$2846.const$2.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2846.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2846.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2(MemorySegment segment, Arena scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


