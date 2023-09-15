// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkCellRendererAccelClass {
 *     struct _GtkCellRendererTextClass parent_class;
 *     void (*accel_edited)(struct _GtkCellRendererAccel*,char*,unsigned int,enum GdkModifierType,unsigned int);
 *     void (*accel_cleared)(struct _GtkCellRendererAccel*,char*);
 *     void (*_gtk_reserved0)();
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 * };
 * }
 */
public class _GtkCellRendererAccelClass {

    public static MemoryLayout $LAYOUT() {
        return constants$2583.const$0;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 304);
    }
    /**
     * {@snippet :
 * void (*accel_edited)(struct _GtkCellRendererAccel*,char*,unsigned int,enum GdkModifierType,unsigned int);
     * }
     */
    public interface accel_edited {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3, int _x4);
        static MemorySegment allocate(accel_edited fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2583.const$1, fi, constants$1513.const$2, scope);
        }
        static accel_edited ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3, int __x4) -> {
                try {
                    constants$2260.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle accel_edited$VH() {
        return constants$2583.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*accel_edited)(struct _GtkCellRendererAccel*,char*,unsigned int,enum GdkModifierType,unsigned int);
     * }
     */
    public static MemorySegment accel_edited$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2583.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*accel_edited)(struct _GtkCellRendererAccel*,char*,unsigned int,enum GdkModifierType,unsigned int);
     * }
     */
    public static void accel_edited$set(MemorySegment seg, MemorySegment x) {
        constants$2583.const$2.set(seg, x);
    }
    public static MemorySegment accel_edited$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2583.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void accel_edited$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2583.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static accel_edited accel_edited(MemorySegment segment, Arena scope) {
        return accel_edited.ofAddress(accel_edited$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*accel_cleared)(struct _GtkCellRendererAccel*,char*);
     * }
     */
    public interface accel_cleared {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(accel_cleared fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2583.const$3, fi, constants$13.const$4, scope);
        }
        static accel_cleared ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle accel_cleared$VH() {
        return constants$2583.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*accel_cleared)(struct _GtkCellRendererAccel*,char*);
     * }
     */
    public static MemorySegment accel_cleared$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2583.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*accel_cleared)(struct _GtkCellRendererAccel*,char*);
     * }
     */
    public static void accel_cleared$set(MemorySegment seg, MemorySegment x) {
        constants$2583.const$4.set(seg, x);
    }
    public static MemorySegment accel_cleared$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2583.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void accel_cleared$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2583.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static accel_cleared accel_cleared(MemorySegment segment, Arena scope) {
        return accel_cleared.ofAddress(accel_cleared$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved0)();
     * }
     */
    public interface _gtk_reserved0 {

        void apply();
        static MemorySegment allocate(_gtk_reserved0 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2583.const$5, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved0 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved0$VH() {
        return constants$2584.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved0)();
     * }
     */
    public static MemorySegment _gtk_reserved0$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2584.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved0)();
     * }
     */
    public static void _gtk_reserved0$set(MemorySegment seg, MemorySegment x) {
        constants$2584.const$0.set(seg, x);
    }
    public static MemorySegment _gtk_reserved0$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2584.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved0$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2584.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved0 _gtk_reserved0(MemorySegment segment, Arena scope) {
        return _gtk_reserved0.ofAddress(_gtk_reserved0$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2584.const$1, fi, constants$7.const$5, scope);
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
        return constants$2584.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2584.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$2584.const$2.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2584.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2584.const$2.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2584.const$3, fi, constants$7.const$5, scope);
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
        return constants$2584.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2584.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$2584.const$4.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2584.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2584.const$4.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2584.const$5, fi, constants$7.const$5, scope);
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
        return constants$2585.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2585.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$2585.const$0.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2585.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2585.const$0.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$2585.const$1, fi, constants$7.const$5, scope);
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
        return constants$2585.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2585.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$2585.const$2.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2585.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2585.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4(MemorySegment segment, Arena scope) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


