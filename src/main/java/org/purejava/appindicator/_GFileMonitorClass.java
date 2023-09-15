// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GFileMonitorClass {
 *     struct _GObjectClass parent_class;
 *     void (*changed)(struct _GFileMonitor*,struct _GFile*,struct _GFile*,enum GFileMonitorEvent);
 *     int (*cancel)(struct _GFileMonitor*);
 *     void (*_g_reserved1)();
 *     void (*_g_reserved2)();
 *     void (*_g_reserved3)();
 *     void (*_g_reserved4)();
 *     void (*_g_reserved5)();
 * };
 * }
 */
public class _GFileMonitorClass {

    public static MemoryLayout $LAYOUT() {
        return constants$1085.const$2;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * void (*changed)(struct _GFileMonitor*,struct _GFile*,struct _GFile*,enum GFileMonitorEvent);
     * }
     */
    public interface changed {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3);
        static MemorySegment allocate(changed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1085.const$3, fi, constants$331.const$4, scope);
        }
        static changed ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3) -> {
                try {
                    constants$1085.const$4.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle changed$VH() {
        return constants$1085.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*changed)(struct _GFileMonitor*,struct _GFile*,struct _GFile*,enum GFileMonitorEvent);
     * }
     */
    public static MemorySegment changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1085.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*changed)(struct _GFileMonitor*,struct _GFile*,struct _GFile*,enum GFileMonitorEvent);
     * }
     */
    public static void changed$set(MemorySegment seg, MemorySegment x) {
        constants$1085.const$5.set(seg, x);
    }
    public static MemorySegment changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1085.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void changed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1085.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static changed changed(MemorySegment segment, Arena scope) {
        return changed.ofAddress(changed$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*cancel)(struct _GFileMonitor*);
     * }
     */
    public interface cancel {

        int apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(cancel fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1086.const$0, fi, constants$10.const$5, scope);
        }
        static cancel ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$14.const$2.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle cancel$VH() {
        return constants$1086.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*cancel)(struct _GFileMonitor*);
     * }
     */
    public static MemorySegment cancel$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1086.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*cancel)(struct _GFileMonitor*);
     * }
     */
    public static void cancel$set(MemorySegment seg, MemorySegment x) {
        constants$1086.const$1.set(seg, x);
    }
    public static MemorySegment cancel$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1086.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cancel$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1086.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static cancel cancel(MemorySegment segment, Arena scope) {
        return cancel.ofAddress(cancel$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved1)();
     * }
     */
    public interface _g_reserved1 {

        void apply();
        static MemorySegment allocate(_g_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1086.const$2, fi, constants$7.const$5, scope);
        }
        static _g_reserved1 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _g_reserved1$VH() {
        return constants$1086.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static MemorySegment _g_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1086.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static void _g_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$1086.const$3.set(seg, x);
    }
    public static MemorySegment _g_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1086.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1086.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved1 _g_reserved1(MemorySegment segment, Arena scope) {
        return _g_reserved1.ofAddress(_g_reserved1$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved2)();
     * }
     */
    public interface _g_reserved2 {

        void apply();
        static MemorySegment allocate(_g_reserved2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1086.const$4, fi, constants$7.const$5, scope);
        }
        static _g_reserved2 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _g_reserved2$VH() {
        return constants$1086.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static MemorySegment _g_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1086.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static void _g_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$1086.const$5.set(seg, x);
    }
    public static MemorySegment _g_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1086.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1086.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved2 _g_reserved2(MemorySegment segment, Arena scope) {
        return _g_reserved2.ofAddress(_g_reserved2$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved3)();
     * }
     */
    public interface _g_reserved3 {

        void apply();
        static MemorySegment allocate(_g_reserved3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1087.const$0, fi, constants$7.const$5, scope);
        }
        static _g_reserved3 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _g_reserved3$VH() {
        return constants$1087.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static MemorySegment _g_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1087.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static void _g_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$1087.const$1.set(seg, x);
    }
    public static MemorySegment _g_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1087.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1087.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved3 _g_reserved3(MemorySegment segment, Arena scope) {
        return _g_reserved3.ofAddress(_g_reserved3$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved4)();
     * }
     */
    public interface _g_reserved4 {

        void apply();
        static MemorySegment allocate(_g_reserved4 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1087.const$2, fi, constants$7.const$5, scope);
        }
        static _g_reserved4 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _g_reserved4$VH() {
        return constants$1087.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static MemorySegment _g_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1087.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static void _g_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$1087.const$3.set(seg, x);
    }
    public static MemorySegment _g_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1087.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1087.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved4 _g_reserved4(MemorySegment segment, Arena scope) {
        return _g_reserved4.ofAddress(_g_reserved4$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved5)();
     * }
     */
    public interface _g_reserved5 {

        void apply();
        static MemorySegment allocate(_g_reserved5 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1087.const$4, fi, constants$7.const$5, scope);
        }
        static _g_reserved5 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _g_reserved5$VH() {
        return constants$1087.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static MemorySegment _g_reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1087.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static void _g_reserved5$set(MemorySegment seg, MemorySegment x) {
        constants$1087.const$5.set(seg, x);
    }
    public static MemorySegment _g_reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1087.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved5$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1087.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static _g_reserved5 _g_reserved5(MemorySegment segment, Arena scope) {
        return _g_reserved5.ofAddress(_g_reserved5$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


