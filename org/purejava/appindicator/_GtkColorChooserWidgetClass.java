// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkColorChooserWidgetClass {
 *     struct _GtkBoxClass parent_class;
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 *     void (*_gtk_reserved5)();
 *     void (*_gtk_reserved6)();
 *     void (*_gtk_reserved7)();
 *     void (*_gtk_reserved8)();
 * };
 * }
 */
public class _GtkColorChooserWidgetClass {

    public static MemoryLayout $LAYOUT() {
        return constants$2642.const$0;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 1008);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2642.const$1, fi, constants$7.const$5, scope);
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
        return constants$2642.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2642.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$2642.const$2.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2642.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2642.const$2.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2642.const$3, fi, constants$7.const$5, scope);
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
        return constants$2642.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2642.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$2642.const$4.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2642.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2642.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2(MemorySegment segment, Arena scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved3)();
     * }
     */
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2642.const$5, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved3 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved3$VH() {
        return constants$2643.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2643.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$2643.const$0.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2643.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2643.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3(MemorySegment segment, Arena scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved4)();
     * }
     */
    public interface _gtk_reserved4 {

        void apply();
        static MemorySegment allocate(_gtk_reserved4 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2643.const$1, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved4 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved4$VH() {
        return constants$2643.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2643.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$2643.const$2.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2643.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2643.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4(MemorySegment segment, Arena scope) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved5)();
     * }
     */
    public interface _gtk_reserved5 {

        void apply();
        static MemorySegment allocate(_gtk_reserved5 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2643.const$3, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved5 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved5$VH() {
        return constants$2643.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved5)();
     * }
     */
    public static MemorySegment _gtk_reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2643.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved5)();
     * }
     */
    public static void _gtk_reserved5$set(MemorySegment seg, MemorySegment x) {
        constants$2643.const$4.set(seg, x);
    }
    public static MemorySegment _gtk_reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2643.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved5$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2643.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved5 _gtk_reserved5(MemorySegment segment, Arena scope) {
        return _gtk_reserved5.ofAddress(_gtk_reserved5$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved6)();
     * }
     */
    public interface _gtk_reserved6 {

        void apply();
        static MemorySegment allocate(_gtk_reserved6 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2643.const$5, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved6 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved6$VH() {
        return constants$2644.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved6)();
     * }
     */
    public static MemorySegment _gtk_reserved6$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2644.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved6)();
     * }
     */
    public static void _gtk_reserved6$set(MemorySegment seg, MemorySegment x) {
        constants$2644.const$0.set(seg, x);
    }
    public static MemorySegment _gtk_reserved6$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2644.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved6$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2644.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved6 _gtk_reserved6(MemorySegment segment, Arena scope) {
        return _gtk_reserved6.ofAddress(_gtk_reserved6$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved7)();
     * }
     */
    public interface _gtk_reserved7 {

        void apply();
        static MemorySegment allocate(_gtk_reserved7 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2644.const$1, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved7 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved7$VH() {
        return constants$2644.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved7)();
     * }
     */
    public static MemorySegment _gtk_reserved7$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2644.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved7)();
     * }
     */
    public static void _gtk_reserved7$set(MemorySegment seg, MemorySegment x) {
        constants$2644.const$2.set(seg, x);
    }
    public static MemorySegment _gtk_reserved7$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2644.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved7$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2644.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved7 _gtk_reserved7(MemorySegment segment, Arena scope) {
        return _gtk_reserved7.ofAddress(_gtk_reserved7$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved8)();
     * }
     */
    public interface _gtk_reserved8 {

        void apply();
        static MemorySegment allocate(_gtk_reserved8 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2644.const$3, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved8 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved8$VH() {
        return constants$2644.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved8)();
     * }
     */
    public static MemorySegment _gtk_reserved8$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2644.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved8)();
     * }
     */
    public static void _gtk_reserved8$set(MemorySegment seg, MemorySegment x) {
        constants$2644.const$4.set(seg, x);
    }
    public static MemorySegment _gtk_reserved8$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2644.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved8$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2644.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved8 _gtk_reserved8(MemorySegment segment, Arena scope) {
        return _gtk_reserved8.ofAddress(_gtk_reserved8$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

