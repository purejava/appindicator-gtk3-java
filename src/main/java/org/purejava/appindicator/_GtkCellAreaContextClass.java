// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkCellAreaContextClass {
 *     struct _GObjectClass parent_class;
 *     void (*allocate)(struct _GtkCellAreaContext*,int,int);
 *     void (*reset)(struct _GtkCellAreaContext*);
 *     void (*get_preferred_height_for_width)(struct _GtkCellAreaContext*,int,int*,int*);
 *     void (*get_preferred_width_for_height)(struct _GtkCellAreaContext*,int,int*,int*);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 *     void (*_gtk_reserved5)();
 *     void (*_gtk_reserved6)();
 * };
 * }
 */
public class _GtkCellAreaContextClass {

    public static MemoryLayout $LAYOUT() {
        return constants$2568.const$4;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * void (*allocate)(struct _GtkCellAreaContext*,int,int);
     * }
     */
    public interface allocate {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(allocate fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2568.const$5, fi, constants$467.const$3, scope);
        }
        static allocate ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                try {
                    constants$1901.const$2.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle allocate$VH() {
        return constants$2569.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*allocate)(struct _GtkCellAreaContext*,int,int);
     * }
     */
    public static MemorySegment allocate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2569.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*allocate)(struct _GtkCellAreaContext*,int,int);
     * }
     */
    public static void allocate$set(MemorySegment seg, MemorySegment x) {
        constants$2569.const$0.set(seg, x);
    }
    public static MemorySegment allocate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2569.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void allocate$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2569.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static allocate allocate(MemorySegment segment, Arena scope) {
        return allocate.ofAddress(allocate$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*reset)(struct _GtkCellAreaContext*);
     * }
     */
    public interface reset {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(reset fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2569.const$1, fi, constants$13.const$1, scope);
        }
        static reset ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle reset$VH() {
        return constants$2569.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reset)(struct _GtkCellAreaContext*);
     * }
     */
    public static MemorySegment reset$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2569.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reset)(struct _GtkCellAreaContext*);
     * }
     */
    public static void reset$set(MemorySegment seg, MemorySegment x) {
        constants$2569.const$2.set(seg, x);
    }
    public static MemorySegment reset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2569.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void reset$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2569.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static reset reset(MemorySegment segment, Arena scope) {
        return reset.ofAddress(reset$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*get_preferred_height_for_width)(struct _GtkCellAreaContext*,int,int*,int*);
     * }
     */
    public interface get_preferred_height_for_width {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(get_preferred_height_for_width fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2569.const$3, fi, constants$179.const$1, scope);
        }
        static get_preferred_height_for_width ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    constants$372.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_preferred_height_for_width$VH() {
        return constants$2569.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*get_preferred_height_for_width)(struct _GtkCellAreaContext*,int,int*,int*);
     * }
     */
    public static MemorySegment get_preferred_height_for_width$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2569.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*get_preferred_height_for_width)(struct _GtkCellAreaContext*,int,int*,int*);
     * }
     */
    public static void get_preferred_height_for_width$set(MemorySegment seg, MemorySegment x) {
        constants$2569.const$4.set(seg, x);
    }
    public static MemorySegment get_preferred_height_for_width$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2569.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void get_preferred_height_for_width$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2569.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_preferred_height_for_width get_preferred_height_for_width(MemorySegment segment, Arena scope) {
        return get_preferred_height_for_width.ofAddress(get_preferred_height_for_width$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*get_preferred_width_for_height)(struct _GtkCellAreaContext*,int,int*,int*);
     * }
     */
    public interface get_preferred_width_for_height {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(get_preferred_width_for_height fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2569.const$5, fi, constants$179.const$1, scope);
        }
        static get_preferred_width_for_height ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    constants$372.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_preferred_width_for_height$VH() {
        return constants$2570.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*get_preferred_width_for_height)(struct _GtkCellAreaContext*,int,int*,int*);
     * }
     */
    public static MemorySegment get_preferred_width_for_height$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2570.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*get_preferred_width_for_height)(struct _GtkCellAreaContext*,int,int*,int*);
     * }
     */
    public static void get_preferred_width_for_height$set(MemorySegment seg, MemorySegment x) {
        constants$2570.const$0.set(seg, x);
    }
    public static MemorySegment get_preferred_width_for_height$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2570.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void get_preferred_width_for_height$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2570.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_preferred_width_for_height get_preferred_width_for_height(MemorySegment segment, Arena scope) {
        return get_preferred_width_for_height.ofAddress(get_preferred_width_for_height$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2570.const$1, fi, constants$7.const$5, scope);
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
        return constants$2570.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2570.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$2570.const$2.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2570.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2570.const$2.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2570.const$3, fi, constants$7.const$5, scope);
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
        return constants$2570.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2570.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$2570.const$4.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2570.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2570.const$4.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2570.const$5, fi, constants$7.const$5, scope);
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
        return constants$2571.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2571.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$2571.const$0.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2571.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2571.const$0.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2571.const$1, fi, constants$7.const$5, scope);
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
        return constants$2571.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2571.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$2571.const$2.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2571.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2571.const$2.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2571.const$3, fi, constants$7.const$5, scope);
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
        return constants$2571.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved5)();
     * }
     */
    public static MemorySegment _gtk_reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2571.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved5)();
     * }
     */
    public static void _gtk_reserved5$set(MemorySegment seg, MemorySegment x) {
        constants$2571.const$4.set(seg, x);
    }
    public static MemorySegment _gtk_reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2571.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved5$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2571.const$4.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2571.const$5, fi, constants$7.const$5, scope);
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
        return constants$2572.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved6)();
     * }
     */
    public static MemorySegment _gtk_reserved6$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2572.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved6)();
     * }
     */
    public static void _gtk_reserved6$set(MemorySegment seg, MemorySegment x) {
        constants$2572.const$0.set(seg, x);
    }
    public static MemorySegment _gtk_reserved6$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2572.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved6$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2572.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved6 _gtk_reserved6(MemorySegment segment, Arena scope) {
        return _gtk_reserved6.ofAddress(_gtk_reserved6$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


