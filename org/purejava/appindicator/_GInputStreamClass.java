// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GInputStreamClass {
 *     struct _GObjectClass parent_class;
 *     long (*read_fn)(struct _GInputStream*,void*,unsigned long,struct _GCancellable*,struct _GError**);
 *     long (*skip)(struct _GInputStream*,unsigned long,struct _GCancellable*,struct _GError**);
 *     int (*close_fn)(struct _GInputStream*,struct _GCancellable*,struct _GError**);
 *     void (*read_async)(struct _GInputStream*,void*,unsigned long,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
 *     long (*read_finish)(struct _GInputStream*,struct _GAsyncResult*,struct _GError**);
 *     void (*skip_async)(struct _GInputStream*,unsigned long,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
 *     long (*skip_finish)(struct _GInputStream*,struct _GAsyncResult*,struct _GError**);
 *     void (*close_async)(struct _GInputStream*,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
 *     int (*close_finish)(struct _GInputStream*,struct _GAsyncResult*,struct _GError**);
 *     void (*_g_reserved1)();
 *     void (*_g_reserved2)();
 *     void (*_g_reserved3)();
 *     void (*_g_reserved4)();
 *     void (*_g_reserved5)();
 * };
 * }
 */
public class _GInputStreamClass {

    public static MemoryLayout $LAYOUT() {
        return constants$759.const$3;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * long (*read_fn)(struct _GInputStream*,void*,unsigned long,struct _GCancellable*,struct _GError**);
     * }
     */
    public interface read_fn {

        long apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(read_fn fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$759.const$5, fi, constants$759.const$4, scope);
        }
        static read_fn ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (long)constants$760.const$0.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle read_fn$VH() {
        return constants$760.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long (*read_fn)(struct _GInputStream*,void*,unsigned long,struct _GCancellable*,struct _GError**);
     * }
     */
    public static MemorySegment read_fn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$760.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long (*read_fn)(struct _GInputStream*,void*,unsigned long,struct _GCancellable*,struct _GError**);
     * }
     */
    public static void read_fn$set(MemorySegment seg, MemorySegment x) {
        constants$760.const$1.set(seg, x);
    }
    public static MemorySegment read_fn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$760.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void read_fn$set(MemorySegment seg, long index, MemorySegment x) {
        constants$760.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_fn read_fn(MemorySegment segment, Arena scope) {
        return read_fn.ofAddress(read_fn$get(segment), scope);
    }
    /**
     * {@snippet :
 * long (*skip)(struct _GInputStream*,unsigned long,struct _GCancellable*,struct _GError**);
     * }
     */
    public interface skip {

        long apply(java.lang.foreign.MemorySegment _x0, long _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(skip fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$760.const$2, fi, constants$4.const$5, scope);
        }
        static skip ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, long __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (long)constants$760.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle skip$VH() {
        return constants$760.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long (*skip)(struct _GInputStream*,unsigned long,struct _GCancellable*,struct _GError**);
     * }
     */
    public static MemorySegment skip$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$760.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long (*skip)(struct _GInputStream*,unsigned long,struct _GCancellable*,struct _GError**);
     * }
     */
    public static void skip$set(MemorySegment seg, MemorySegment x) {
        constants$760.const$4.set(seg, x);
    }
    public static MemorySegment skip$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$760.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void skip$set(MemorySegment seg, long index, MemorySegment x) {
        constants$760.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static skip skip(MemorySegment segment, Arena scope) {
        return skip.ofAddress(skip$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*close_fn)(struct _GInputStream*,struct _GCancellable*,struct _GError**);
     * }
     */
    public interface close_fn {

        int apply(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(close_fn fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$760.const$5, fi, constants$12.const$2, scope);
        }
        static close_fn ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _a, java.lang.foreign.MemorySegment _b, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$12.const$4.invokeExact(symbol, _a, _b, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle close_fn$VH() {
        return constants$761.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*close_fn)(struct _GInputStream*,struct _GCancellable*,struct _GError**);
     * }
     */
    public static MemorySegment close_fn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$761.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*close_fn)(struct _GInputStream*,struct _GCancellable*,struct _GError**);
     * }
     */
    public static void close_fn$set(MemorySegment seg, MemorySegment x) {
        constants$761.const$0.set(seg, x);
    }
    public static MemorySegment close_fn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$761.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void close_fn$set(MemorySegment seg, long index, MemorySegment x) {
        constants$761.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static close_fn close_fn(MemorySegment segment, Arena scope) {
        return close_fn.ofAddress(close_fn$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*read_async)(struct _GInputStream*,void*,unsigned long,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public interface read_async {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2, int _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5, java.lang.foreign.MemorySegment _x6);
        static MemorySegment allocate(read_async fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$761.const$2, fi, constants$761.const$1, scope);
        }
        static read_async ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2, int __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5, java.lang.foreign.MemorySegment __x6) -> {
                try {
                    constants$761.const$3.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle read_async$VH() {
        return constants$761.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*read_async)(struct _GInputStream*,void*,unsigned long,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static MemorySegment read_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$761.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*read_async)(struct _GInputStream*,void*,unsigned long,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static void read_async$set(MemorySegment seg, MemorySegment x) {
        constants$761.const$4.set(seg, x);
    }
    public static MemorySegment read_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$761.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void read_async$set(MemorySegment seg, long index, MemorySegment x) {
        constants$761.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_async read_async(MemorySegment segment, Arena scope) {
        return read_async.ofAddress(read_async$get(segment), scope);
    }
    /**
     * {@snippet :
 * long (*read_finish)(struct _GInputStream*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public interface read_finish {

        long apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(read_finish fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$761.const$5, fi, constants$166.const$0, scope);
        }
        static read_finish ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (long)constants$762.const$0.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle read_finish$VH() {
        return constants$762.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long (*read_finish)(struct _GInputStream*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static MemorySegment read_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$762.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long (*read_finish)(struct _GInputStream*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static void read_finish$set(MemorySegment seg, MemorySegment x) {
        constants$762.const$1.set(seg, x);
    }
    public static MemorySegment read_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$762.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void read_finish$set(MemorySegment seg, long index, MemorySegment x) {
        constants$762.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static read_finish read_finish(MemorySegment segment, Arena scope) {
        return read_finish.ofAddress(read_finish$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*skip_async)(struct _GInputStream*,unsigned long,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public interface skip_async {

        void apply(java.lang.foreign.MemorySegment _x0, long _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(skip_async fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$762.const$3, fi, constants$762.const$2, scope);
        }
        static skip_async ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, long __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    constants$762.const$4.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle skip_async$VH() {
        return constants$762.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*skip_async)(struct _GInputStream*,unsigned long,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static MemorySegment skip_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$762.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*skip_async)(struct _GInputStream*,unsigned long,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static void skip_async$set(MemorySegment seg, MemorySegment x) {
        constants$762.const$5.set(seg, x);
    }
    public static MemorySegment skip_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$762.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void skip_async$set(MemorySegment seg, long index, MemorySegment x) {
        constants$762.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static skip_async skip_async(MemorySegment segment, Arena scope) {
        return skip_async.ofAddress(skip_async$get(segment), scope);
    }
    /**
     * {@snippet :
 * long (*skip_finish)(struct _GInputStream*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public interface skip_finish {

        long apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(skip_finish fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$763.const$0, fi, constants$166.const$0, scope);
        }
        static skip_finish ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (long)constants$762.const$0.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle skip_finish$VH() {
        return constants$763.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long (*skip_finish)(struct _GInputStream*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static MemorySegment skip_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$763.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long (*skip_finish)(struct _GInputStream*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static void skip_finish$set(MemorySegment seg, MemorySegment x) {
        constants$763.const$1.set(seg, x);
    }
    public static MemorySegment skip_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$763.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void skip_finish$set(MemorySegment seg, long index, MemorySegment x) {
        constants$763.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static skip_finish skip_finish(MemorySegment segment, Arena scope) {
        return skip_finish.ofAddress(skip_finish$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*close_async)(struct _GInputStream*,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public interface close_async {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(close_async fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$763.const$2, fi, constants$281.const$5, scope);
        }
        static close_async ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    constants$754.const$2.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle close_async$VH() {
        return constants$763.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*close_async)(struct _GInputStream*,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static MemorySegment close_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$763.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*close_async)(struct _GInputStream*,int,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static void close_async$set(MemorySegment seg, MemorySegment x) {
        constants$763.const$3.set(seg, x);
    }
    public static MemorySegment close_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$763.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void close_async$set(MemorySegment seg, long index, MemorySegment x) {
        constants$763.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static close_async close_async(MemorySegment segment, Arena scope) {
        return close_async.ofAddress(close_async$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*close_finish)(struct _GInputStream*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public interface close_finish {

        int apply(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(close_finish fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$763.const$4, fi, constants$12.const$2, scope);
        }
        static close_finish ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _a, java.lang.foreign.MemorySegment _b, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (int)constants$12.const$4.invokeExact(symbol, _a, _b, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle close_finish$VH() {
        return constants$763.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*close_finish)(struct _GInputStream*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static MemorySegment close_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$763.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*close_finish)(struct _GInputStream*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static void close_finish$set(MemorySegment seg, MemorySegment x) {
        constants$763.const$5.set(seg, x);
    }
    public static MemorySegment close_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$763.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void close_finish$set(MemorySegment seg, long index, MemorySegment x) {
        constants$763.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static close_finish close_finish(MemorySegment segment, Arena scope) {
        return close_finish.ofAddress(close_finish$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_g_reserved1)();
     * }
     */
    public interface _g_reserved1 {

        void apply();
        static MemorySegment allocate(_g_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$764.const$0, fi, constants$7.const$5, scope);
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
        return constants$764.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static MemorySegment _g_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$764.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved1)();
     * }
     */
    public static void _g_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$764.const$1.set(seg, x);
    }
    public static MemorySegment _g_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$764.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$764.const$1.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$764.const$2, fi, constants$7.const$5, scope);
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
        return constants$764.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static MemorySegment _g_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$764.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved2)();
     * }
     */
    public static void _g_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$764.const$3.set(seg, x);
    }
    public static MemorySegment _g_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$764.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$764.const$3.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$764.const$4, fi, constants$7.const$5, scope);
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
        return constants$764.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static MemorySegment _g_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$764.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved3)();
     * }
     */
    public static void _g_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$764.const$5.set(seg, x);
    }
    public static MemorySegment _g_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$764.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$764.const$5.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$765.const$0, fi, constants$7.const$5, scope);
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
        return constants$765.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static MemorySegment _g_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$765.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved4)();
     * }
     */
    public static void _g_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$765.const$1.set(seg, x);
    }
    public static MemorySegment _g_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$765.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$765.const$1.set(seg.asSlice(index*sizeof()), x);
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
            return RuntimeHelper.upcallStub(constants$765.const$2, fi, constants$7.const$5, scope);
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
        return constants$765.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static MemorySegment _g_reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$765.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_g_reserved5)();
     * }
     */
    public static void _g_reserved5$set(MemorySegment seg, MemorySegment x) {
        constants$765.const$3.set(seg, x);
    }
    public static MemorySegment _g_reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$765.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void _g_reserved5$set(MemorySegment seg, long index, MemorySegment x) {
        constants$765.const$3.set(seg.asSlice(index*sizeof()), x);
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


