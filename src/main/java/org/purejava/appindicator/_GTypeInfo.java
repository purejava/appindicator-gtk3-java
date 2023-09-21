// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GTypeInfo {
 *     unsigned short class_size;
 *     void (*base_init)(void*);
 *     void (*base_finalize)(void*);
 *     void (*class_init)(void*,void*);
 *     void (*class_finalize)(void*,void*);
 *     void* class_data;
 *     unsigned short instance_size;
 *     unsigned short n_preallocs;
 *     void (*instance_init)(struct _GTypeInstance*,void*);
 *     struct _GTypeValueTable* value_table;
 * };
 * }
 */
public class _GTypeInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$553.const$2;
    }
    public static VarHandle class_size$VH() {
        return constants$553.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short class_size;
     * }
     */
    public static short class_size$get(MemorySegment seg) {
        return (short)constants$553.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short class_size;
     * }
     */
    public static void class_size$set(MemorySegment seg, short x) {
        constants$553.const$3.set(seg, x);
    }
    public static short class_size$get(MemorySegment seg, long index) {
        return (short)constants$553.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void class_size$set(MemorySegment seg, long index, short x) {
        constants$553.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * void (*base_init)(void*);
     * }
     */
    public interface base_init {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(base_init fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$553.const$4, fi, constants$13.const$1, scope);
        }
        static base_init ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle base_init$VH() {
        return constants$553.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*base_init)(void*);
     * }
     */
    public static MemorySegment base_init$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$553.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*base_init)(void*);
     * }
     */
    public static void base_init$set(MemorySegment seg, MemorySegment x) {
        constants$553.const$5.set(seg, x);
    }
    public static MemorySegment base_init$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$553.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void base_init$set(MemorySegment seg, long index, MemorySegment x) {
        constants$553.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static base_init base_init(MemorySegment segment, Arena scope) {
        return base_init.ofAddress(base_init$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*base_finalize)(void*);
     * }
     */
    public interface base_finalize {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(base_finalize fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$554.const$0, fi, constants$13.const$1, scope);
        }
        static base_finalize ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle base_finalize$VH() {
        return constants$554.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*base_finalize)(void*);
     * }
     */
    public static MemorySegment base_finalize$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$554.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*base_finalize)(void*);
     * }
     */
    public static void base_finalize$set(MemorySegment seg, MemorySegment x) {
        constants$554.const$1.set(seg, x);
    }
    public static MemorySegment base_finalize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$554.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void base_finalize$set(MemorySegment seg, long index, MemorySegment x) {
        constants$554.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static base_finalize base_finalize(MemorySegment segment, Arena scope) {
        return base_finalize.ofAddress(base_finalize$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*class_init)(void*,void*);
     * }
     */
    public interface class_init {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(class_init fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$554.const$2, fi, constants$13.const$4, scope);
        }
        static class_init ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle class_init$VH() {
        return constants$554.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*class_init)(void*,void*);
     * }
     */
    public static MemorySegment class_init$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$554.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*class_init)(void*,void*);
     * }
     */
    public static void class_init$set(MemorySegment seg, MemorySegment x) {
        constants$554.const$3.set(seg, x);
    }
    public static MemorySegment class_init$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$554.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void class_init$set(MemorySegment seg, long index, MemorySegment x) {
        constants$554.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static class_init class_init(MemorySegment segment, Arena scope) {
        return class_init.ofAddress(class_init$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*class_finalize)(void*,void*);
     * }
     */
    public interface class_finalize {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(class_finalize fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$554.const$4, fi, constants$13.const$4, scope);
        }
        static class_finalize ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle class_finalize$VH() {
        return constants$554.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*class_finalize)(void*,void*);
     * }
     */
    public static MemorySegment class_finalize$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$554.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*class_finalize)(void*,void*);
     * }
     */
    public static void class_finalize$set(MemorySegment seg, MemorySegment x) {
        constants$554.const$5.set(seg, x);
    }
    public static MemorySegment class_finalize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$554.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void class_finalize$set(MemorySegment seg, long index, MemorySegment x) {
        constants$554.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static class_finalize class_finalize(MemorySegment segment, Arena scope) {
        return class_finalize.ofAddress(class_finalize$get(segment), scope);
    }
    public static VarHandle class_data$VH() {
        return constants$555.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* class_data;
     * }
     */
    public static MemorySegment class_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$555.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* class_data;
     * }
     */
    public static void class_data$set(MemorySegment seg, MemorySegment x) {
        constants$555.const$0.set(seg, x);
    }
    public static MemorySegment class_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$555.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void class_data$set(MemorySegment seg, long index, MemorySegment x) {
        constants$555.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle instance_size$VH() {
        return constants$555.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short instance_size;
     * }
     */
    public static short instance_size$get(MemorySegment seg) {
        return (short)constants$555.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short instance_size;
     * }
     */
    public static void instance_size$set(MemorySegment seg, short x) {
        constants$555.const$1.set(seg, x);
    }
    public static short instance_size$get(MemorySegment seg, long index) {
        return (short)constants$555.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void instance_size$set(MemorySegment seg, long index, short x) {
        constants$555.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle n_preallocs$VH() {
        return constants$555.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short n_preallocs;
     * }
     */
    public static short n_preallocs$get(MemorySegment seg) {
        return (short)constants$555.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short n_preallocs;
     * }
     */
    public static void n_preallocs$set(MemorySegment seg, short x) {
        constants$555.const$2.set(seg, x);
    }
    public static short n_preallocs$get(MemorySegment seg, long index) {
        return (short)constants$555.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void n_preallocs$set(MemorySegment seg, long index, short x) {
        constants$555.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * void (*instance_init)(struct _GTypeInstance*,void*);
     * }
     */
    public interface instance_init {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(instance_init fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$555.const$3, fi, constants$13.const$4, scope);
        }
        static instance_init ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle instance_init$VH() {
        return constants$555.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*instance_init)(struct _GTypeInstance*,void*);
     * }
     */
    public static MemorySegment instance_init$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$555.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*instance_init)(struct _GTypeInstance*,void*);
     * }
     */
    public static void instance_init$set(MemorySegment seg, MemorySegment x) {
        constants$555.const$4.set(seg, x);
    }
    public static MemorySegment instance_init$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$555.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void instance_init$set(MemorySegment seg, long index, MemorySegment x) {
        constants$555.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static instance_init instance_init(MemorySegment segment, Arena scope) {
        return instance_init.ofAddress(instance_init$get(segment), scope);
    }
    public static VarHandle value_table$VH() {
        return constants$555.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GTypeValueTable* value_table;
     * }
     */
    public static MemorySegment value_table$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$555.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GTypeValueTable* value_table;
     * }
     */
    public static void value_table$set(MemorySegment seg, MemorySegment x) {
        constants$555.const$5.set(seg, x);
    }
    public static MemorySegment value_table$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$555.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void value_table$set(MemorySegment seg, long index, MemorySegment x) {
        constants$555.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

