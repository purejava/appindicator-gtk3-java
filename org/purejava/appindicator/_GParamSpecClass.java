// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GParamSpecClass {
 *     struct _GTypeClass g_type_class;
 *     unsigned long value_type;
 *     void (*finalize)(struct _GParamSpec*);
 *     void (*value_set_default)(struct _GParamSpec*,struct _GValue*);
 *     int (*value_validate)(struct _GParamSpec*,struct _GValue*);
 *     int (*values_cmp)(struct _GParamSpec*,struct _GValue*,struct _GValue*);
 *     int (*value_is_valid)(struct _GParamSpec*,struct _GValue*);
 *     void* dummy[3];
 * };
 * }
 */
public class _GParamSpecClass {

    public static MemoryLayout $LAYOUT() {
        return constants$573.const$1;
    }
    public static MemorySegment g_type_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle value_type$VH() {
        return constants$573.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long value_type;
     * }
     */
    public static long value_type$get(MemorySegment seg) {
        return (long)constants$573.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long value_type;
     * }
     */
    public static void value_type$set(MemorySegment seg, long x) {
        constants$573.const$2.set(seg, x);
    }
    public static long value_type$get(MemorySegment seg, long index) {
        return (long)constants$573.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void value_type$set(MemorySegment seg, long index, long x) {
        constants$573.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * void (*finalize)(struct _GParamSpec*);
     * }
     */
    public interface finalize {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(finalize fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$573.const$3, fi, constants$13.const$1, scope);
        }
        static finalize ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle finalize$VH() {
        return constants$573.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*finalize)(struct _GParamSpec*);
     * }
     */
    public static MemorySegment finalize$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$573.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*finalize)(struct _GParamSpec*);
     * }
     */
    public static void finalize$set(MemorySegment seg, MemorySegment x) {
        constants$573.const$4.set(seg, x);
    }
    public static MemorySegment finalize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$573.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void finalize$set(MemorySegment seg, long index, MemorySegment x) {
        constants$573.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static finalize finalize(MemorySegment segment, Arena scope) {
        return finalize.ofAddress(finalize$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*value_set_default)(struct _GParamSpec*,struct _GValue*);
     * }
     */
    public interface value_set_default {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(value_set_default fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$573.const$5, fi, constants$13.const$4, scope);
        }
        static value_set_default ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle value_set_default$VH() {
        return constants$574.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*value_set_default)(struct _GParamSpec*,struct _GValue*);
     * }
     */
    public static MemorySegment value_set_default$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$574.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*value_set_default)(struct _GParamSpec*,struct _GValue*);
     * }
     */
    public static void value_set_default$set(MemorySegment seg, MemorySegment x) {
        constants$574.const$0.set(seg, x);
    }
    public static MemorySegment value_set_default$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$574.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void value_set_default$set(MemorySegment seg, long index, MemorySegment x) {
        constants$574.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_set_default value_set_default(MemorySegment segment, Arena scope) {
        return value_set_default.ofAddress(value_set_default$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*value_validate)(struct _GParamSpec*,struct _GValue*);
     * }
     */
    public interface value_validate {

        int apply(java.lang.foreign.MemorySegment filter_info, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(value_validate fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$574.const$1, fi, constants$9.const$0, scope);
        }
        static value_validate ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle value_validate$VH() {
        return constants$574.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*value_validate)(struct _GParamSpec*,struct _GValue*);
     * }
     */
    public static MemorySegment value_validate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$574.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*value_validate)(struct _GParamSpec*,struct _GValue*);
     * }
     */
    public static void value_validate$set(MemorySegment seg, MemorySegment x) {
        constants$574.const$2.set(seg, x);
    }
    public static MemorySegment value_validate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$574.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void value_validate$set(MemorySegment seg, long index, MemorySegment x) {
        constants$574.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_validate value_validate(MemorySegment segment, Arena scope) {
        return value_validate.ofAddress(value_validate$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*values_cmp)(struct _GParamSpec*,struct _GValue*,struct _GValue*);
     * }
     */
    public interface values_cmp {

        int apply(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(values_cmp fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$574.const$3, fi, constants$12.const$2, scope);
        }
        static values_cmp ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle values_cmp$VH() {
        return constants$574.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*values_cmp)(struct _GParamSpec*,struct _GValue*,struct _GValue*);
     * }
     */
    public static MemorySegment values_cmp$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$574.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*values_cmp)(struct _GParamSpec*,struct _GValue*,struct _GValue*);
     * }
     */
    public static void values_cmp$set(MemorySegment seg, MemorySegment x) {
        constants$574.const$4.set(seg, x);
    }
    public static MemorySegment values_cmp$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$574.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void values_cmp$set(MemorySegment seg, long index, MemorySegment x) {
        constants$574.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static values_cmp values_cmp(MemorySegment segment, Arena scope) {
        return values_cmp.ofAddress(values_cmp$get(segment), scope);
    }
    /**
     * {@snippet :
 * int (*value_is_valid)(struct _GParamSpec*,struct _GValue*);
     * }
     */
    public interface value_is_valid {

        int apply(java.lang.foreign.MemorySegment filter_info, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(value_is_valid fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$574.const$5, fi, constants$9.const$0, scope);
        }
        static value_is_valid ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle value_is_valid$VH() {
        return constants$575.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int (*value_is_valid)(struct _GParamSpec*,struct _GValue*);
     * }
     */
    public static MemorySegment value_is_valid$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$575.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int (*value_is_valid)(struct _GParamSpec*,struct _GValue*);
     * }
     */
    public static void value_is_valid$set(MemorySegment seg, MemorySegment x) {
        constants$575.const$0.set(seg, x);
    }
    public static MemorySegment value_is_valid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$575.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void value_is_valid$set(MemorySegment seg, long index, MemorySegment x) {
        constants$575.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_is_valid value_is_valid(MemorySegment segment, Arena scope) {
        return value_is_valid.ofAddress(value_is_valid$get(segment), scope);
    }
    public static MemorySegment dummy$slice(MemorySegment seg) {
        return seg.asSlice(56, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


