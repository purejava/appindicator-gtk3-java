// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkLockButtonClass {
 *     struct _GtkButtonClass parent_class;
 *     void (*reserved0)();
 *     void (*reserved1)();
 *     void (*reserved2)();
 *     void (*reserved3)();
 *     void (*reserved4)();
 *     void (*reserved5)();
 *     void (*reserved6)();
 *     void (*reserved7)();
 * };
 * }
 */
public class _GtkLockButtonClass {

    public static MemoryLayout $LAYOUT() {
        return constants$2855.const$5;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 1088);
    }
    /**
     * {@snippet :
 * void (*reserved0)();
     * }
     */
    public interface reserved0 {

        void apply();
        static MemorySegment allocate(reserved0 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2856.const$0, fi, constants$7.const$5, scope);
        }
        static reserved0 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle reserved0$VH() {
        return constants$2856.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reserved0)();
     * }
     */
    public static MemorySegment reserved0$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2856.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reserved0)();
     * }
     */
    public static void reserved0$set(MemorySegment seg, MemorySegment x) {
        constants$2856.const$1.set(seg, x);
    }
    public static MemorySegment reserved0$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2856.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved0$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2856.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved0 reserved0(MemorySegment segment, Arena scope) {
        return reserved0.ofAddress(reserved0$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*reserved1)();
     * }
     */
    public interface reserved1 {

        void apply();
        static MemorySegment allocate(reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2856.const$2, fi, constants$7.const$5, scope);
        }
        static reserved1 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle reserved1$VH() {
        return constants$2856.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reserved1)();
     * }
     */
    public static MemorySegment reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2856.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reserved1)();
     * }
     */
    public static void reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$2856.const$3.set(seg, x);
    }
    public static MemorySegment reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2856.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2856.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved1 reserved1(MemorySegment segment, Arena scope) {
        return reserved1.ofAddress(reserved1$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*reserved2)();
     * }
     */
    public interface reserved2 {

        void apply();
        static MemorySegment allocate(reserved2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2856.const$4, fi, constants$7.const$5, scope);
        }
        static reserved2 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle reserved2$VH() {
        return constants$2856.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reserved2)();
     * }
     */
    public static MemorySegment reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2856.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reserved2)();
     * }
     */
    public static void reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$2856.const$5.set(seg, x);
    }
    public static MemorySegment reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2856.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2856.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved2 reserved2(MemorySegment segment, Arena scope) {
        return reserved2.ofAddress(reserved2$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*reserved3)();
     * }
     */
    public interface reserved3 {

        void apply();
        static MemorySegment allocate(reserved3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2857.const$0, fi, constants$7.const$5, scope);
        }
        static reserved3 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle reserved3$VH() {
        return constants$2857.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reserved3)();
     * }
     */
    public static MemorySegment reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2857.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reserved3)();
     * }
     */
    public static void reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$2857.const$1.set(seg, x);
    }
    public static MemorySegment reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2857.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2857.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved3 reserved3(MemorySegment segment, Arena scope) {
        return reserved3.ofAddress(reserved3$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*reserved4)();
     * }
     */
    public interface reserved4 {

        void apply();
        static MemorySegment allocate(reserved4 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2857.const$2, fi, constants$7.const$5, scope);
        }
        static reserved4 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle reserved4$VH() {
        return constants$2857.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reserved4)();
     * }
     */
    public static MemorySegment reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2857.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reserved4)();
     * }
     */
    public static void reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$2857.const$3.set(seg, x);
    }
    public static MemorySegment reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2857.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2857.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved4 reserved4(MemorySegment segment, Arena scope) {
        return reserved4.ofAddress(reserved4$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*reserved5)();
     * }
     */
    public interface reserved5 {

        void apply();
        static MemorySegment allocate(reserved5 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2857.const$4, fi, constants$7.const$5, scope);
        }
        static reserved5 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle reserved5$VH() {
        return constants$2857.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reserved5)();
     * }
     */
    public static MemorySegment reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2857.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reserved5)();
     * }
     */
    public static void reserved5$set(MemorySegment seg, MemorySegment x) {
        constants$2857.const$5.set(seg, x);
    }
    public static MemorySegment reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2857.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved5$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2857.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved5 reserved5(MemorySegment segment, Arena scope) {
        return reserved5.ofAddress(reserved5$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*reserved6)();
     * }
     */
    public interface reserved6 {

        void apply();
        static MemorySegment allocate(reserved6 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2858.const$0, fi, constants$7.const$5, scope);
        }
        static reserved6 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle reserved6$VH() {
        return constants$2858.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reserved6)();
     * }
     */
    public static MemorySegment reserved6$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2858.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reserved6)();
     * }
     */
    public static void reserved6$set(MemorySegment seg, MemorySegment x) {
        constants$2858.const$1.set(seg, x);
    }
    public static MemorySegment reserved6$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2858.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved6$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2858.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved6 reserved6(MemorySegment segment, Arena scope) {
        return reserved6.ofAddress(reserved6$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*reserved7)();
     * }
     */
    public interface reserved7 {

        void apply();
        static MemorySegment allocate(reserved7 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$2858.const$2, fi, constants$7.const$5, scope);
        }
        static reserved7 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle reserved7$VH() {
        return constants$2858.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reserved7)();
     * }
     */
    public static MemorySegment reserved7$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2858.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reserved7)();
     * }
     */
    public static void reserved7$set(MemorySegment seg, MemorySegment x) {
        constants$2858.const$3.set(seg, x);
    }
    public static MemorySegment reserved7$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2858.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved7$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2858.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved7 reserved7(MemorySegment segment, Arena scope) {
        return reserved7.ofAddress(reserved7$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


